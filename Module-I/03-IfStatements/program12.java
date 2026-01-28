public class program12 {
    public static void main(String[] args) {
        
        double AccBal = 10000.0;
        int amt = 1220;

        if (amt <= AccBal) {
            if (amt % 100 == 0) {
                System.out.println("withdraw Success");
            } else {
                System.out.println("Invalid Denomination ");
            }
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

// output :
// Invalid Denomination