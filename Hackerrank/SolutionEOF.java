import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionEOF {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line = 0;
        while(scanner.hasNext()){
            String s = scanner.nextLine();
            System.out.println(++line+" "+s);
        }
        scanner.close();
    }
}
