
public class program7 {
    public static void main(String[] args) {
        // average of an array
        int[] arr = { 13, 10, 14, 15, 12, 11 };
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int avg = sum / arr.length;
        System.out.println("The avarage of an array is : " + avg);
    }
}

// output :
// The avarage of an array is : 12
