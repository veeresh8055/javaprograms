
public class program3 {
    public static void main(String[] args) {
        // Program for Switch statement..!

        // 1.Withdrawal
        // 2.Balance Enquiry
        // 3.PIN Change
        // 4.Mini Statement

        int option = 1;
        switch (option) {
            case 1:
                System.out.println("Withdrawal");
                break;
            case 2:
                System.out.println("Balance Enquiry");
                break;
            case 3:
                System.out.println("PIN Change");
                break;
            case 4:
                System.out.println("Mini Statement");
                break;

            default:
                System.out.println("Invalid Option");
                break;
        }
    }
}
// output :
// Withdrawal