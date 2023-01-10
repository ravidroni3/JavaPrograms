package FunctionalInterfaces;

interface Doable{  
    default void doIt(){  
        System.out.println("Do it now");  
    }  
}  
@FunctionalInterface  
interface Sayable8 extends Doable{  
    void say(String msg);   // abstract method  
}  
public class Example3 implements Sayable8{  
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
       Example3 fie = new Example3();  
        fie.say("Hello there");  
        fie.doIt();  
    }  
}  