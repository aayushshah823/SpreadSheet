
public class SpreadSheet{

	private static int ROWS = 11;
	private static int COLS = 8;
	private char[] lettersOfFirstRow = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G' };
	private Cell[][] grid = new Cell[ROWS][COLS];	
	private String name = "";

	/**
	 * Above this are the values for the spreadsheet. A-G are the labeled
	 * X-Axis. We need 11 rows and 8 columns as we have a empty cell on the very
	 * first cell. Used a two-dimensional array to represent the row and
	 * columns.
	 */


	public String printSheet() {
		/**
		 * printSheet hands all the values above. This method uses its values to
		 * create parts of the spreadsheet. 
		 * returns the String.
		 */
		String output = "";
		String lines = "------------+------------+------------+------------+------------+------------+------------+------------+";
		for (int row = 0; row < ROWS; row++) {
			for (int column = 0; column < COLS; column++) {
				String cellString = this.grid[row][column].toShort();
				cellString += "|";
				output += cellString;
			}
			output += "\n" + lines + "\n";
			
		}

		return output;
	}

	public SpreadSheet() {

		/**
		 * BELOW:
		 * //This is going to make new cells
		 */
		for (int row = 0; row < ROWS; row++) {
			for (int column = 0; column < COLS; column++) {
				grid[row][column] = new Cell();
			}
		}

		/**
		 * BELOW:
		 * This will set position of cell.
		 * I mean IF my Input is A1 = 4 then it will store the value at correct location
		 */
		for (int row = 0; row < ROWS; row++) {
			for (int column = 0; column < COLS; column++) {
				if (row == 0 || column == 0) {
					grid[row][column].setPosition("null");
				} else {
					String pos = lettersOfFirstRow[column - 1] + "";
					pos = pos + row + "";
					grid[row][column].setPosition(pos);
				}
			}
		}


		for (int row = 0; row < ROWS; row++) {
			if (row == 0) {
				for (int column = 1; column < COLS; column++) {
					grid[row][column].setValue(lettersOfFirstRow[column - 1] + "");
				}
			} else {
				grid[row][0].setValue(row + "");
			}
		}
	}

	/**
	 * This method will clear the particular cell
	 * @param str takes in string such as "clear A4"
	 */
	public void clearCellAt(String str) {
		for (int row = 0; row < ROWS; row++) {
			for (int column = 0; column < COLS; column++) {
				if (grid[row][column].getPos().equals(str)) {
					String pos = grid[row][column].getPos();
					grid[row][column] = new Cell();
					grid[row][column].setPosition(pos);
				}
			}
		}
	}

	public Cell[][] getArray() {
		return grid;
	}

	public void setEquals(Cell[][] sheet) {
		for (int row = 1; row < ROWS; row++) {
			for (int column = 1; column < COLS; column++) {
				sheet[row][column].setValue(sheet[row][column].toFull());
			}
		}
	}

	public void setName(String str) {
		name = str;
	}

	public String getName() {
		return name;
	}

	public void setValueAt(String label, String input) {
		/**
		 * This method handles where the input should be put in (e.g A10). This
		 * calls to getPosition to find out where the cell is and then puts in
		 * the myinput value in that cell.
		 */
		for (int row = 0; row < ROWS; row++) {
			for (int column = 0; column < COLS; column++) {
				if (grid[row][column].getPos().equals(label)) {
					grid[row][column].setValue(input);
				}
			}
		}
	}

	/**
	 * This method will set the value at particluar cell
	 *  This method handles where the input should be put in (e.g A10). This
	 * calls to getPosition to find out where the cell is and then puts in
	 * the input in that cell. 
	 * @param str will take in Cell name such as A1, A10 etc.
	 * @returns the value of that particular cell
	 */
	public String getValueAt(String str) 
	{
		for (int row = 0; row < ROWS; row++) 
		{
			for (int column = 0; column < COLS; column++)
			{
				if (grid[row][column].getPos().equals(str.toUpperCase())) 
				{
					if (grid[row][column].toFull() != "            ") 
					{
						if(((grid[row][column].toFull().contains("-")) && (grid[row][column].toFull().contains(".0"))) || grid[row][column].toFull().contains(".0"))
						{
							return str + " = " + grid[row][column].toFull().substring(0, str.length()-1);		
						}


						else if (grid[row][column].toFull().contains("\"")) 	//|| grid[row][column].toFull().contains("[a-zA-Z]+"))
						{
							return str + " = " + "\""+ grid[row][column].toFull() + "\""; 
						}


						else
						{	
							return str + " = " + grid[row][column].toFull();	
						}
					} 
					else
					{
						return str + " = <empty>";
					}
				}
			}
		}
		return "ERROR: Please have a valid Cell Range";
	}

}
