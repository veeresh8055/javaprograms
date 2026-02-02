public class program5 {
    public static void main(String[] args) {
        // program to find the given number is perfect number or not
        int num = 28;
        int a = 1;
        int sum = 0;
        while (a <= num / 2) {
            if (num % a == 0) {
                sum += a;
            }
            a++;
        }
        if (sum == num) {
            System.out.println("The given Number is perfect Number  ");
        } else {
            System.out.println("Its not a perfect number");
        }
    }
}
// output
// The given Number is perfect Number
