package day5java;

	 abstract class Bike {  
		  abstract void runspeed(); 
		  void wheels(){
			  
		  }
		}  
	 class Honda4 extends Bike{  
		void runspeed(){
			System.out.println("running safely under limit");
			}  
		public static void main(String args[]){  
		 Bike obj = new Honda4();  
		 obj.runspeed();  
		}  
	}  