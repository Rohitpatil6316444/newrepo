package pack;

public class Calculator 
{

   int a=100,b; // instance variable  default value if not initialized 
   
   void add()
   {
	   System.out.println("a=" + a + "     bye"); 
   }
   void subtract()
   {
	   int y;  //local variable
	  // System.out.println(y) ;  //compilation error
	   
   }
   void display()
   {   int a=11;
	   System.out.println(a); //10
	   System.out.println(this.a );//100
   }

	public static void main(String args[]) {

		Calculator c= new Calculator();// object 
		
		c.add();
	}

}
