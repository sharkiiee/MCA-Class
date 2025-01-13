
import java.util.Scanner;

// Input a number and check such number is even or odd

public class A01file {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int value = scanner.nextInt();
        if (value % 2 == 0) {
            System.out.println("This is a even number");
        }
        else{
            System.out.println("Number is odd");
        }
    }
}