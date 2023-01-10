package FunctionalInterfaces;

//A functional interface can have methods of object class. See in the following example.
@FunctionalInterface  
interface sayable{  
    void say(String msg);   // abstract method  
    // It can contain any number of Object class methods.  
    int hashCode();  
    String toString();  
    boolean equals(Object obj);  
}  
public class Example2 implements sayable{  
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        Example2 fie = new Example2();  
        fie.say("Hello there");  
    }  
}  