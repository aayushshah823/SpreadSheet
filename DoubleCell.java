
public class DoubleCell extends Cell {
	/**
	 * Creates double cell
	 * @param num	num is my input
	 * @param cellIndex here cell index is cellPosition (i.e. B6)
	 */
	public DoubleCell(double num, String cellIndex)
	{
		String str = "" + num;		//converts double to string 
		
		if(str.length()>12)
		{
			str = str.substring(0,12) + ">";
		}
		
		String shortValue = "";
		for(int a = 1; a <= ((12-str.length()) / 2); a++)
		{
			shortValue += "";
		}
		shortValue +=str;
		
		while (shortValue.length() < 12)
		{
			shortValue+="";
		}
		
		super.setValue(str, shortValue);
		setPosition(cellIndex);
	}
}
