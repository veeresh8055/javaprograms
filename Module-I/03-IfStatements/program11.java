public class program11 {
    public static void main(String[] args) {
        // nested if else statements
        int a = 12;
        if (a % 2 == 0) {
            if (a < 10) {
                System.out.println("java");
            } else {
                System.out.println("Python");
            }
        } else {
            if (a < 10) {
                System.out.println("JavaScript");
            } else {
                System.out.println("C#");
            }
        }
    }
}
// output :
// Python