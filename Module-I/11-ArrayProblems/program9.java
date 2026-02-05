
public class program9 {
    public static void main(String[] args) {
        // smallest elememt  in an array

        int[] arr = { 13, 10, 14, 15, 12, 11 };
        int smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println(" the smallest value  is : " + smallest);

    }
}

// output
// the smallest value is : 10
