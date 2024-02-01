
public class Constructor {
	private int var1;
	private int var2;
	
	public Constructor(int var1, int var2) {
		this.var1 = var1;
		this.var2 = var2;
	}
	
	public Constructor(Constructor c) {
		this.var1 = c.var1;
		this.var2 = c.var2;
	}
	
	public int getVar1() {
		return var1;
	}

	public int getVar2() {
		return var2;
	}

	public static void main(String[] args) {
		Constructor c1 = new Constructor(10, 20);
		Constructor c2 = new Constructor(c1);
		System.out.println(c1.getVar1()+" and "+c1.getVar2());
		System.out.println(c2.getVar1()+" and "+c2.getVar2());
	}
	
}
