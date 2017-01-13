
public class Cell {

	/**
	 * smallValue: The values of myInput which are less than 12 characters
	 * bigValues: The values of myInput whichare bigger that 12 characters
	 * pos: the position of cell
	 */
	String smallValues;
	String bigValues;
	String pos;

	public Cell() {
		smallValues= "            ";
	
		bigValues = "            ";
	}
	
	public String toShort() {
		return smallValues;
	}

	public String toFull() {
		return bigValues;
	}

	public void setValue(String fullVal) {
		bigValues = fullVal;

		if (fullVal.length() > 12) {
			fullVal = fullVal.substring(0, 11) + ">";
		}

		smallValues = "";
		for (int k = 1; k <= ((12 - fullVal.length()) / 2); k++) {
			smallValues += " ";
		}
		smallValues += fullVal;
		while (smallValues.length() < 12) {
			smallValues += " ";
		}
	}

	public void setValue(String fullVal, String shortVal) {
		bigValues = fullVal;

		if (shortVal.length() > 12) {
			shortVal = shortVal.substring(0, 11) + ">";
		}

		smallValues = "";
		for (int k = 1; k <= ((12 - shortVal.length()) / 2); k++) {
			smallValues += " ";
		}
		smallValues += shortVal;
		while (smallValues.length() < 12) {
			smallValues += " ";
		}
	}

	public void setPosition(String str) {
		pos = str;
	}

	public String getPos() {
		return pos;
	}
}
