public class program3 {
    public static void main(String[] args) {
        // divisor of a number ...!
        int num = 20;
        int a = 1;
        while (a <= num / 2) {
            if (num % a == 0) {
                System.out.println(a);
            }
            a++;
        }
        System.out.println(num);
    }
}
// output
// 1
// 2
// 4
// 5
// 10
// 20