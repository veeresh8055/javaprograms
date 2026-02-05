
public class program6 {
    public static void main(String[] args) {
        // sum of odd numbers in an array
        int[] arr = { 13, 10, 14, 15, 12, 11 };
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }
        System.out.println("The sum of even numbers  : " + sum);
    }
}

// output :
// The sum of even numbers  : 39