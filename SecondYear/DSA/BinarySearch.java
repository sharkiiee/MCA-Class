public class BinarySearch {
    static int binarySearch(int[] arr, int target,int len){
        int low = 0;
        int high = len;
        while (low <= high) {
            int mid =(low +high)/2;
            if (arr[mid]==target){
                return mid;
            }
            else if(arr[mid] > target){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
            
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int element = 5;
        int value = binarySearch(arr,element,arr.length);
        if(value == -1){
            System.out.println("Element is not present in the array");
        }
        else{
            System.out.println("Element found at index " + value);
        }
    }
}
