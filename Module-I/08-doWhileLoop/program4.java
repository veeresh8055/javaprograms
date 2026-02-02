public class program4 {
    public static void main(String[] args) {
        // sum of a divisors of a given number 
        int num = 15;
        int a =1;
        int sum =0;
        while(a <= num/2){
            if( num % a == 0){
                System.out.println(a);
                sum += a ;
            }
            a++;
        }
        System.out.println("The Sum of a all divisor is :" + sum );
    }
}
// output

// 1
// 3
// 5
// The Sum of a all divisor is :9