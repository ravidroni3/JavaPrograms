//private accessmodifier

package PrivateAccessmodifiers;

class A{  
private A(){}//private constructor  
void msg(){System.out.println("Hello java");}  
}  
public class Simple1{  
 public static void main(String args[]){  
   A obj=new A();//Compile Time Error  
 }  
}  


//If you make any class constructor private, you cannot create the instance of that class from outside the class.
//Note: A class cannot be private or protected except nested class.