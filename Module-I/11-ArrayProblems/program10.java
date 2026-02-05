
public class program10 {
    public static void main(String[] args) {
        // array searching

        int[] arr = { 11, 13, 14, 16, 15, 12, 14, 18 };
        int elem = 20;
        boolean present = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elem) {
                present = true;
            }

        }

        if (present) {
            System.out.println(elem + " found in the array");
        } else {
            System.out.println(elem + " not  found in the array");
        }
    }
}

// output :
// 20 not found in the array