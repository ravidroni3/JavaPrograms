package StaticVariables;

public class Example1 {
	  static int number1; //Static variable type: int
	  static int number2; //Static variable type: int
	  static String str1; //Static variable type: String
	  static String str2; //Static variable type: String
	  public static void main(String[] args) {
	    number1 = 101;
	    number2 = 102;
	    str1 = "techvidan";
	    str2 = "static variable article";
	    System.out.println("Static Number: " + number1);
	    System.out.println("Static Number: " + number2);
	    System.out.println("Static String: " + str1);
	    System.out.println("Static String: " + str2);
	  }
	}