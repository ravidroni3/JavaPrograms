package StaticVariables;

public class Demo{
	   public static void main(String args[]){
	     Student4 s1 = new Student4();
	     s1.showData();
	     Student4 s2 = new Student4();
	     s2.showData();
	     //Student.b++;
	     //s1.showData();
	  }
	}

	class Student4 {
	int a; //initialized to zero
	static int b; //initialized to zero only when class is loaded not for each object created.

	  Student4(){
	   //Constructor incrementing static variable b
	   b++;
	  }

	   public void showData(){
	      System.out.println("Value of a = "+a);
	      System.out.println("Value of b = "+b);
	   }
	//public static void increment(){
	//a++;
	//}

	}