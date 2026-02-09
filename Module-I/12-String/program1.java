public class program1 {
    public static void main(String[] args) {
        String str = "Developer";
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(12));

    }
}

// output :
// e
// v
// Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Index 12 out of bounds for length 9