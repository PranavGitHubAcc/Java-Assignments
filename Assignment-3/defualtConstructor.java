
public class defualtConstructor {
	private int var1;
	private int var2;
	
	public defualtConstructor() {
		this.var1 = 10;
		this.var2 = 20;
	}
	
	
	public int getVar1() {
		return var1;
	}

	public int getVar2() {
		return var2;
	}


	public static void main(String[] args) {
		defualtConstructor d1 = new defualtConstructor();
		System.out.println(d1.getVar1()+" and "+d1.getVar2());
	}
	
	
}
