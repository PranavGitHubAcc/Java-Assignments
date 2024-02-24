
public class NumberConverter {
	public int stringToInt(String string) {
		Integer integer = Integer.parseInt(string);
		return integer.intValue();
	}
	public String doubleToString(double d) {
		Double d1 = d;
		return d1.toString();
	}
	
	public float intToFloat(int i) {
		Integer integer = i;
		return integer.floatValue();
	}
	
	public String floatToString(float f) {
		Float float1 = f;
		return float1.toString();
	}
	
	public static void main(String[] args) {
		NumberConverter numberConverter = new NumberConverter();
		System.out.println(numberConverter.stringToInt("10")+10);
		System.out.println(10+numberConverter.doubleToString(10.12));
		System.out.println(10+numberConverter.floatToString(10.01f));
		System.out.println(numberConverter.intToFloat(10));
	}
}
