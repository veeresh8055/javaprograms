public class problem2 {
    public static void main(String[] args) {

        // finding the even and  odd number is array 
        int[] arr = { 23, 98, 54, 17, 44,65, 87 };

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("Even : " + arr[i]);
            } else {
                System.out.println("Odd : " + arr[i]);
            }
        }
    }
}
// output
// Odd : 23
// Even : 98
// Even : 54
// Odd : 17
// Even : 44
// Odd : 65
// Odd : 87
