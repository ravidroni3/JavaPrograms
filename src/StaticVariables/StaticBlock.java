package StaticVariables;

public class StaticBlock {
	  static int number; //Static variable type: int
	  static String str; //Static variable type: String
	  // Static Block one
	  static {
	    System.out.println("First Static Block:");
	    number = 51;
	    str = "Static Block Example: Techvidvan";
	  }
	  // Static Block two
	  static {
	    System.out.println("Second Static Block:");
	    number = 10;
	    str = "Block two: Techvidvan";
	  }
	  public static void main(String[] args) {
	    System.out.println("Static Number: " + number);
	    System.out.println("Static String: " + str);
	  }
}
/*
We use the static block when we need to initialize the static variables. 
The static blocks load or execute at the time of loading a class. */