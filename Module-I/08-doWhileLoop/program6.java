public class program6 {
    public static void main(String[] args) {
        int num = 28;
        int a = 1;
        int count = 0;
        while (a <= num / 2) {
            if (num % a == 0) {
                count++;
            }
            a++;
        }

        System.out.println(" The count is :" + count);
    }
}
// output:
// The count is :5
