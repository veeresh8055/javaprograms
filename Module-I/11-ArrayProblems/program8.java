
public class program8 {
    public static void main(String[] args) {

        // finding the largest value in ana array
        int[] arr = { 13, 10, 14, 15, 12, 11 };
        int large = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
        }
        System.out.println("The large value is : " + large);
    }
}

// output :
// The large value is : 15