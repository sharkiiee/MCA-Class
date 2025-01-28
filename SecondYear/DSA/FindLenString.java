// Find the length of the string without using any predefined function like len.

// Note :- You can't use null value to check whether string is ending or not because in java string is an class and length is stored internally.
class FindlenString{
    public static void main(String[] args) {
        String str = "Sarthak Agrawal";
        int length = 0;

        while (true) {
            try {
                
                str.charAt(length);
                length++; 
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }

        System.out.println("Length of the string: " + length); 
    }
}


