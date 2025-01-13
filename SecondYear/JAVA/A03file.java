
import java.util.Scanner;

// Swap two variables without using third variable.

public class A03file {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first value");
        int value1 = scanner.nextInt();
        System.out.println("Enter the second value");
        int value2 = scanner.nextInt();

        System.out.println("Before swapping: a = " + value1 + ", b = " + value2);
        value1 = value1 + value2; 
        value2 = value1 - value2; 
        value1 = value1 - value2; 

        System.out.println("After swapping: a = " + value1 + ", b = " + value2);
    }
}
