package DefaultAccessmodfiers;

//Using the default members inside the different class but within the same package


class Beta {      //Different class
public static void main(String args[])
{
  Alpha object1 = new Alpha();
  object1.iAmDefault = 20;
  System.out.println("Value of private member is: " +object1.iAmDefault);
  object1.defaultMethod();
}
}