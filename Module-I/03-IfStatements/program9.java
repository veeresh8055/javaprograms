public class program9 {
    public static void main(String[] args) {
        char ch = '1';
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("UPPERCASE ");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("LOWERCASE");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("NUMBERS");

        } else {
            System.out.println("SPECIAL CHARACTER");
        }

    }
}
// output
// NUMBERS
