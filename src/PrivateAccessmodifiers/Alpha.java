package PrivateAccessmodifiers;

class Alpha
{
private int iAmPrivate;    //private data member
  private void privateMethod()  //private method
  {
    System.out.println("I am a private method");
  }


/* Objects of Alpha can modify the value of iAmPrivate variable and invoke privateMethod(). As shown below*/

public static void main(String args[])
  {
    Alpha object1 = new Alpha();
    /*Accessing private variables or private method outside their classes raises an error*/
    object1.iAmPrivate = 10;
    System.out.println("Value of private member is: " +object1.iAmPrivate);
    object1.privateMethod();
  }
}