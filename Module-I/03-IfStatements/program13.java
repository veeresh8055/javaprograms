public class program13 {
    public static void main(String[] args) {
        
        char gender = 'm';
        int age = 22;
        if (gender == 'm') {
            if (age >= 21) {
                System.out.println("Eligible Bachelore");
            } else {
                System.out.println("Underage BOy");
            }

        } else if (gender == 'f') {
            if (age >= 18) {
                System.out.println("Eligible Spinster");
            } else {
                System.out.println("Underage Girl");
            }
        } else {
            System.out.println("Inavlid Gender");
        }

    }
}

// output : 
// Eligible Bachelore