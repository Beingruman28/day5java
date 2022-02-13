package day5java;

//import java.lang.*;

      public class Interfaceprogram {

			   public void eat() {
			   }
			   
			   public void travel() {
			}
      }
	   class MammalInt extends Interfaceprogram{ 

		   public void eat() {
		      System.out.println("Mammal eats");
		   }

		   public void travel() {
		      System.out.println("Mammal travels");
		   } 

		   public int noOfLegs() {
		      return 0;
		   }
		   public static void main(String args[]) {
			   Interfaceprogram ip =new Interfaceprogram ();
			   ip.eat();
			   ip.travel();
		      MammalInt m = new MammalInt();
		      m.eat();
		      m.travel();
		   }
	  }