import java.util.Random;

public class Dice1{

   private Random randGen;

   public Dice1 ( ) {
      randGen = new Random ( );
   }

   public int nextRoll( ) {
      // You supply this code.
      return r.nextInt(6) + 1; //1-6
	   return -1; 
   }
	
   public void tester (int howMany) {
	  int k;
	  k = 0;
	  while (k < howMany) {
	     System.out.println (nextRoll ( ));
	     k = k + 1;
	  }

     }
   }
   
  public static void main(String[] args){
   Dice1 d = new Dice1();
   d.tester(1000);
}
