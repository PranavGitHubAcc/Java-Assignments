import java.util.Arrays;
import java.util.Scanner;

class Check{
	private String string;
	
	public Check(){
		Scanner scanner= new Scanner(System.in);
		string = scanner.next();
		char newCharArr[] = new char[string.length()];
		for(int i = string.length()-1; i>=0 ; i--) {
			newCharArr[string.length()-i-1] = string.charAt(i);
		}
		
		if(Arrays.equals(newCharArr, string.toCharArray())) {
			System.out.println("String is a palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
		
		scanner.close();
		
	}
}

public class Palindrome {
	public static void main(String[] args) {
		Check check = new Check();
	}
}
