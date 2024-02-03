
public class Vehicle {
	
	int wheels, doors, seats;
	String company;
	
	public Vehicle(int wheels, int doors, int seats, String company) {
		this.wheels = wheels;
		this.doors = doors;
		this.seats = seats;
		this.company = company;
	}
	
	 void display() {
		 System.out.println("The car has "+wheels+" wheels "+doors+" doors and "+seats+" seats.");
	 }
	 
	 public static void main(String[] args) {
		 
		Vehicle v1 = new Vehicle(4, 4, 4, "Tata");
		v1.display();
		
	}
	
}
