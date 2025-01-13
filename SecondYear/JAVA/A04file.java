// Input three number and display them in ascending order.

import java.util.Scanner;

public class A04file {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter the value \n");
            arr[i] = scanner.nextInt();
        }
        

    }
}
