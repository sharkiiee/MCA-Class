// Create a single dimentional array

// public class MultidimentionalArray {
//     public static void main(String[] args) {
//         int[] values = new int[5];
//         values[0] = 1;
//         values[1] = 1;
//         values[2] = 1;
//         values[3] = 1;
//         values[4] = 1;

//         for (int i = 0; i < values.length; i++) {
//             System.out.println(values[i]);
//         }
//     }
// }

// Single Dimentional array

public class MultidimentionalArray {
    public static void main(String[] args) {
        int nums[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                nums[i][j] = (int)(Math.random() * 10);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
