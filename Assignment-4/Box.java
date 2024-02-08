
public class Box {
	private int volume = 10;
	private int side = 10;
	public void Box() {
		System.out.println("Volume: "+this.volume+" Side: "+ this.volume);
	}
	public static void main(String[] args) {
		Box b = new Box();
		b.Box();
	}
}
