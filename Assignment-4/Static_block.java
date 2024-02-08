
public class Static_block {
	static int a;
	static {
		a=10;
		System.out.println("static block executed");
	}
	public static void main(String[] args) {
		Static_block s = new Static_block();
		System.out.println("Main block executed. a="+ s.a);
	}
}
