import java.util.Scanner;


public class WrapperExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter an integer: ");
        int intVal = scanner.nextInt();


        System.out.print("Enter a character: ");
        char charVal = scanner.next().charAt(0);


        System.out.print("Enter a double: ");
        double doubleVal = scanner.nextDouble();


        Integer intInt = Integer.valueOf(intVal);
        Character charChar = Character.valueOf(charVal);
        Double doubleDouble = Double.valueOf(doubleVal);


        System.out.println("Integer: " + intInt);
        System.out.println("Character: " + charChar);
        System.out.println("Double: " + doubleDouble);


        scanner.close();
    }
}
