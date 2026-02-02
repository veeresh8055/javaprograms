public class program7 {
    public static void main(String[] args) {
     // program to find the given number is prime or not 
        int num = 23;
        int a = 1;
        int count = 0;
        while (a <= num / 2) {
            if (num % a == 0) {
                count++;
            }
            a++;
        }
        if (count == 1) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }

    }
}
// output:
// Prime Number
