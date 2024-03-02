class Swap{
	int a, b;
	void swapNumbers() {
		int temp = a;
		a = b;
		b = temp;
	}
	void printNumbers() {
		System.out.println("a = "+a+" and b = "+ b);
	}
}
public class SwapFunction {
	public static void main(String[] args) {
		Swap swap = new Swap();
		swap.a = 100;
		swap.b = 50;
		swap.printNumbers();
		swap.swapNumbers();
		swap.printNumbers();
	}
}
