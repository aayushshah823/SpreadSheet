import java.util.Scanner;

/**
 * @author Aayush Shah
 */
public class Program {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to myVisiCalc");

		SpreadSheet spreadSheet = new SpreadSheet();
		String myInput = "";


		/**
		 * Below this, the program will get input and determine if the program
		 * is started or terminated. This also handles the clear, exit, and
		 * print commands.
		 */

		while (!myInput.equalsIgnoreCase("exit")) { // Loops command until "exit"

			System.out.println("Enter Your Command: ");
			myInput = sc.nextLine();

			if (myInput.equals("clear")) {
				/**
				 * New Spreadsheet "clear" is created completely making a new
				 * spreadsheet.
				 */
				SpreadSheet clear = new SpreadSheet();
				spreadSheet = clear;
			} 

			/**
			 * When myInput equals exit the program will terminate
			 */
			else if (myInput.equals("exit")) {

				System.out.println("Farewell!");

			}


			else if(myInput.equalsIgnoreCase("help"))
			{
				System.out.println("print: prints the spreadsheet\n" 
						+ "exit: quits the program\n"
						+ "clear: clears the spreadsheet\n"
						+ "clear Cell : clears a given cell\n"
						+ "sorta: arranges cell in ascending order\n"
						+ "sortd: arranges cell in desending order\n"
						+ "If You Need More HELP then type in help <function> ");
			}
			else if(myInput.equalsIgnoreCase("help print"))
			{
				System.out.println("The print function prints out the spreadsheet "
						+ "with the current values of each cell");
			}
			else if(myInput.equalsIgnoreCase("help exit"))
			{		
				System.out.println("The exit function quits the program");
			}
			else if(myInput.equalsIgnoreCase("help clear"))
			{
				System.out.println("The clear function clears the entire spreadsheet");
			}	
			else if(myInput.equalsIgnoreCase("help cell"))	
			{
				System.out.println("The clear Cell function clears the specific cell");
			}
			else if(myInput.equalsIgnoreCase("help sorta"))	
			{
				System.out.println("The sorta function arranges the specific cell range in ascending order");
			}
			else if(myInput.equalsIgnoreCase("help sortd"))	
			{
				System.out.println("The sortd function arranges the specific cell range in desending order");
			} 

			else if (myInput.equalsIgnoreCase("print")) {
				/**
				 * print will call to the spreadsheet class and create a new
				 * spreadsheet according to the values of printsheet()
				 */
				System.out.println();
				System.out.println(spreadSheet.printSheet());
			} 
			else if (myInput.contains("=")) 
			{
				/* BELOW IS
				 * Error Handeling, EXTRA CREDIT
				 */
				if (myInput.toLowerCase().contains("null")) {
					System.out.println("Error: Please Have a valid answer ");		// + myInput.substring(0, myInput.indexOf('=') - 1)
				}
				else 
				{

					//CellPosition is Left Side of my Input, basically Function i.e. A1.

					String cellPosition = myInput.substring(0, myInput.indexOf('=') - 1);		
					String leftSide = myInput.substring(myInput.indexOf("=") + 2, myInput.length());


					if(leftSide.contains("\""))		
					{
						/**
						 * This is for strings containing quotation marks ("")
						 */
						leftSide = myInput.substring(myInput.indexOf("=") + 3, myInput.length()-1);
						spreadSheet.setValueAt(cellPosition.toUpperCase(), leftSide);
					}

					else if((leftSide.contains("-") && leftSide.contains(".")) || leftSide.contains("/") || leftSide.contains(".") || leftSide.equals("0"))
					{
						/**
						 * This will for negative numbers and date cells
						 */
						leftSide = myInput.substring(myInput.indexOf("=") + 2, myInput.length());
						spreadSheet.setValueAt(cellPosition.toUpperCase(), leftSide);
					}

					//					else if(leftSide.contains("("))
					//					{
					//						FormulaCell formulaCell = new FormulaCell(cellPosition, leftSide, leftSide);
					//					}
					//					
					else
					{
						leftSide = myInput.substring(myInput.indexOf("=") + 2, myInput.length()) + ".0";
						spreadSheet.setValueAt(cellPosition.toUpperCase(), leftSide);
					}
				}
			} 

			else if (myInput.toLowerCase().equals("clear")) {
				spreadSheet = new SpreadSheet();
			} 
			else if (myInput.toLowerCase().contains("clear")) {
				spreadSheet.clearCellAt(myInput.substring(myInput.indexOf(' ') + 1).toUpperCase());
			} 

			else {
				System.out.println(spreadSheet.getValueAt(myInput.toUpperCase()));
			}
		}
	}
}