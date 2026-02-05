
public class program12 {
    public static void main(String[] args) {

        // array sorting in descending order
        int[] arr = { 13, 10, 15, 14, 18, 16 };

        System.out.println("Before String..");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }

        System.out.println("After Sorting ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

// output :
// Before String..
// 13
// 10
// 15
// 14
// 18
// 16
// After Sorting
// 18
// 16
// 15
// 14
// 13
// 10
