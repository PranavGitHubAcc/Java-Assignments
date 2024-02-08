
public class ObjectCount {
	static int a;
	static {
		a=0;
	}
	public ObjectCount() {
		a++;
	}
	static void viewCount() {
		System.out.println("Number of objects: "+a);
	}
	public static void main(String[] args) {
		ObjectCount obj1= new ObjectCount();
		viewCount();
		ObjectCount obj2= new ObjectCount();
		ObjectCount obj3= new ObjectCount();
		viewCount();
	}
}
