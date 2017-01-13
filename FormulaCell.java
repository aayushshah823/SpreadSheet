
public class FormulaCell extends Cell{
	private int num1;
	private int den1;
	
	public FormulaCell(String f) 
	{
		String num;
		String den;


		if(f.contains("/"))
		{
			int i = f.indexOf("/");
			num = f.substring(0, i);
			den = f.substring(i+1);
		}

		else if(f.contains("+"))
		{
			int j = f.indexOf("+");
			String firtsNumber = f.substring(0, j);
			String SecondNumber = f.substring(j+1);
			
		}
	}
}
