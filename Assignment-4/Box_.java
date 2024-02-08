
public class Box_ {
	private int side = 10;
	public void volume() {
		System.out.println("Volume: "+Math.pow(this.side, 3));
	}
	public static void main(String[] args) {
		Box_ b = new Box_();
		b.volume();
	}
}
