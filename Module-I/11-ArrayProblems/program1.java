public class program1 {
    public static void main(String[] args) {
         int[] arr = {1,2,3,4,5,6,7};


         System.out.println("Original array ");
         for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
         }

         arr[3]=20;
         arr[1] =33;

         System.out.println("Modified array ");

         for(int i = 0 ; i <arr.length;i++){
            System.out.println(arr[i]);
         }
    }
}
// output:
// Original array 
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// Modified array
// 1
// 33
// 3
// 20
// 5
// 6
// 7