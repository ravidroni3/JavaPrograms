//default constructor

package DefaultAccessmodfiers;

class BaseClass 
{ 
    void display()      //no access modifier indicates default modifier
       { 
           System.out.println("BaseClass::Display with 'dafault' scope"); 
       } 
} 
 
class Main
{ 
    public static void main(String args[]) 
       {   
          //access class with default scope
          BaseClass obj = new BaseClass(); 
   
          obj.display();    //access class method with default scope
       } 
}

/*
In the above program, we have a class and a method inside it without any access modifier. 
Hence both the class and method display has default access. 
Then we see that in the method, we can directly create an object of the class and call the method.*/