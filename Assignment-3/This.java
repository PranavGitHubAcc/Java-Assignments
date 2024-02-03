
public class This {
	private int var1, var2;

	public This(int var1, int var2) {
		this.var1 = var1; // Usage of this keyword
		this.var2 = var2;
	}
	
	void display() {
		System.out.println(this.var1+" " +this.var2);
	}
	
	public static void main(String[] args) {
		This obj = new This(100, 200);
		obj.display();
	}
	
}
