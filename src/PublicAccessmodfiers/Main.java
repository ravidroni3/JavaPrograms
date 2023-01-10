//public accessmodifier
package PublicAccessmodfiers;

//Main.java
 public class Main {
 public static void main( String[] args ) {
     // accessing the public class
     Animal animal = new Animal();

     // accessing the public variable
     animal.legCount = 4;
     // accessing the public method
     animal.display();
 }
}


 /*Public are accessible from everywhere. 
  A class, method, constructor, interface, etc declared public can be accessed from any other class.
  However, if the public class we are trying to access is in a different package, 
  then the public class still needs to be imported.
 */
 
 /*
When methods, variables, classes, and so on are declared public, then we can access them from anywhere. 
The public access modifier has no scope restriction. */
 
 /*Here,

The public class Animal is accessed from the Main class.
The public variable legCount is accessed from the Main class.
The public method display() is accessed from the Main class.*/