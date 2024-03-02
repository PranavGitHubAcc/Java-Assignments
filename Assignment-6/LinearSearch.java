
public class LinearSearch {
	public static void main(String[] args) {
		int a = 89, flag = 0;
		int intArr[] = {12, 14, 90, 98, 7, 10, 89, 87};
		for(int i =0; i<intArr.length; i++) {
			if(a == intArr[i]) {
				flag = 1;
				System.out.println("Element at position "+ (i+1));
			}
		}
		if(flag == 0) {
			System.out.println("Element not found");
		}
		
 	}
}
