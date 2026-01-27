public class program6 {
    public static void main(String[] args) {
         double AccBal = 10000.00;
        int Amt = 3000;
        if(Amt <= AccBal){
            System.out.println("Withdraw Success");
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
}
