class Beverage{
	public void prepare() {
		System.out.println("Pour water in a cup");
	}
	public void serve() {
		System.out.println("Serve the cup.");
	}
	
}

class Coffee extends Beverage{
	public void prepare() {
		System.out.println("Brew espresso");
	}
	public void serve() {
		System.out.println("Serve in an espresso cup.");
	}
}

class Tea extends Beverage{
	public void prepare() {
		System.out.println("Steep the tea bags in hot water.");
	}
	public void serve() {
		System.out.println("Take out the tea bag and serve.");
	}
}

class Smoothie extends Beverage{
	public void prepare() {
		System.out.println("Blend fruits and ice together.");
	}
	public void serve() {
		System.out.println("Serve with a straw.");
	}
}

public class Cafe {
    public static void main(String[] args) {

        Beverage coffee = new Coffee();
        System.out.println("Coffee:");
        coffee.prepare();
        coffee.serve();
        System.out.println();
        Beverage tea = new Tea();
        System.out.println("Tea:");
        tea.prepare();
        tea.serve();
        System.out.println();
        Beverage smoothie = new Smoothie();
        System.out.println("Smoothie:");
        smoothie.prepare();
        smoothie.serve();
    }
}

