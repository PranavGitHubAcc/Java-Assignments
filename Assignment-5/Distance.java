class DistanceCalculator{
	public void distance(double a, double b, boolean kilo) {
		System.out.println(Math.abs(a-b)+"km"); 
	}
	public void distance(double a, double b) {
		System.out.println(Math.abs(a-b)+"m"); 
	}
	public void distance(double x[], double y[]) {
		double a = Math.abs(x[0] - y[0]);
		double b = Math.abs(x[1] - y[1]);
		System.out.println(Math.sqrt(a*a + b*b));
	}
}

public class Distance {
    public static void main(String[] args) {
        DistanceCalculator calculator = new DistanceCalculator();

        calculator.distance(10.5, 7.8, true);
        calculator.distance(10.5, 7.8);

        double[] point1 = {1.0, 2.0};
        double[] point2 = {4.0, 6.0};
        calculator.distance(point1, point2);
    }
}

