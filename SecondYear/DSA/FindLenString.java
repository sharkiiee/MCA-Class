// Find the length of the string without using any predefined function like len.

class FindlenString{
    public static void main(String[] args) {
        String str = "Sarthak Agrawal"; // Example string
        int length = 0;

        while (true) {
            try {
                // Try to access the character at the current index
                str.charAt(length);
                length++; // Increment length if a character is found
            } catch (StringIndexOutOfBoundsException e) {
                // Break the loop when we reach the end of the string
                break;
            }
        }

        System.out.println("Length of the string: " + length); // Output the length
    }
}


