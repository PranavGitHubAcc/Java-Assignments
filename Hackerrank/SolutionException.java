import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(x/y);
        }catch(ArithmeticException a){
            System.out.println(a);
        }
        catch(Exception e){
            String string = e.getClass().toString();
            System.out.println(string.substring(6));
        }
    }
}
