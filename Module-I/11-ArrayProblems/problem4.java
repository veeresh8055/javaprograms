
public class problem4 {
    public static void main(String[] args) {

        // sum of all array elemets
        int[] arr = { 13, 10, 14, 15, 12, 11 };
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The sum is : " + sum);

    }
}

// output :
// The sum is : 75
