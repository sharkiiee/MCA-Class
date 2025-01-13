// Take 3 value from the user and find the largest among them.
import java.util.Scanner;

public class A02file {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter the value \n");
            arr[i] = scanner.nextInt();
        }
        
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>largest) {
                largest = arr[i];
            }
        }
        System.out.printf("The largest value is : %d",large);
    }
}
