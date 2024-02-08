
public class Inner {
	private int outerVariable = 10;
	
	public int getOuterVariable() {
		return outerVariable;
	}
	// Inner class (not static)
	class Inner1{ 
		
		void display() {
			// can access outer class variables
			System.out.println("Inner class method. Outer variable: "+ outerVariable);
		}
	}
	
	public static void main(String[] args) {
		Inner i = new Inner();
		Inner.Inner1 i_ = i.new Inner1();
		i_.display();
	}
		
}
