public class program10 {
  public static void main(String[] args) {
    
      int age = 20;
    if(age >=0 && age <=3){
        System.out.println("Free Ticket");
    }else if(age >3 && age <= 15){
        System.out.println("Half Ticket");
    }else if(age > 15 && age <= 60){
        System.out.println("Full Ticket");
    }else{
        System.out.println("Senior cetiezen Ticket");
    }

  }   
}
// output
// Full Ticket