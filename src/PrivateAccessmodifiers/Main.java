//private accessmodifier
package PrivateAccessmodifiers;

class Data {
    // private variable
    private String name;
}

public class Main {
    public static void main(String[] main){

        // create an object of Data
        Main d = new Main();

        // access private variable and field from another class
        d.name = "Programiz";
    }
}

//When variables and methods are declared private, they cannot be accessed outside of the class.
/*In the above example, we have declared a private variable named name. When we run the program, 
 we will get the following error:


Main.java:18: error: name has private access in Data
        d.name = "Programiz";
         ^
The error is generated because we are trying to access the private variable of the Data class from the Main class.*/