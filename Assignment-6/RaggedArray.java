
public class RaggedArray {
	public static void main(String[] args) {
		int arr[][] = new int[3][];
		arr[0] = new int[3];
		arr[1] = new int[2];
		arr[0][0] = 0;
		arr[0][1] = 10;
		arr[0][2] = 20;
		
		arr[1][0] = -10;
		arr[1][1] = -20;
		System.out.println("Array 1: ");
		for(int i = 0; i<3; i++) {
			System.out.print(arr[0][i]+ " ");
		}
		System.out.println("\nArray 2: ");
		for(int i = 0; i<2; i++) {
			System.out.print(arr[1][i]+ " ");
		}
	}
}
