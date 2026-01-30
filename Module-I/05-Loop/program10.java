public class program10 {
    public static void main(String[] args) {
         int n = 5 ;
        char val = 'A';
        for(int i = 0; i <n;i++){
            if(i%2==0){
                System.out.print(val++ + " ");
            }
            else{
                System.out.print("*" + " ");
            }
        }
    }
}

// output
// A * B * C 