package LambdaExpressions;

//with no parameter

interface Sayable{  
    public String say();  
}  
public class WithNoParameter{  
public static void main(String[] args) {  
    Sayable s=()->{  
        return "I have nothing to say.";  
    };  
    System.out.println(s.say());  
}  
}  