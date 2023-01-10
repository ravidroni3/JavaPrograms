package ProtectedAccessmodfiers;

//Accessing the protected members inside the same package but different class.


class Beta
{
public static void main(String args[])
{
   Alpha object1 = new Alpha();
   object1.iAmProtected = 30;
   System.out.println("Value of protected member is: " +object1.iAmProtected);
   object1.protectedMethod();
}
}