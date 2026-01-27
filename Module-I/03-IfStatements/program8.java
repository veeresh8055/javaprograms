public class program8 {
    public static void main(String[] args) {
        int n = 12;
        if (n % 2 == 0 && n % 3 == 0) {
            System.out.println("Banglore");
        } else if (n % 2 == 0) {
            System.out.println("Chennai");

        } else if (n % 3 == 0) {
            System.out.println("Hydrabad");
        } else {
            System.out.println("Manglore");
        }
    }
}

// output 
// Banglore