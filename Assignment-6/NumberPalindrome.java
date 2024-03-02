import java.util.Scanner;

public class NumberPalindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int store = number;
		int newNumber = 0;
		while(number!=0) {
			newNumber = newNumber*10 +number % 10;
			number /= 10;
		}
		if(newNumber == store) {
			System.out.println("Number is a palindrome");
		}else {
			System.out.println("Not a plaindrome");
		}
		scanner.close();
	}
}
