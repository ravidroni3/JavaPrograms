//static variable
package StaticVariables;

public class StaticExample 
{
  public static void main(String[] args) 
  {
    DataObject objOne = new DataObject();
    objOne.staticVar = 10;
    objOne.nonStaticVar = 20;
     
    DataObject objTwo = new DataObject();
     
    System.out.println(objTwo.staticVar);   //10
    System.out.println(objTwo.nonStaticVar);  //null
     
    DataObject.staticVar = 30;  //Direct Access
     
    System.out.println(objOne.staticVar);   //30
    System.out.println(objTwo.staticVar);   //30
  }
}
 
class DataObject {
  public static Integer staticVar;
  public Integer nonStaticVar;
}

/*
 Notice how we changed the value to 30, and both objects now see the updated value which is 30.
 Another thing you should have noticed that how we are able to access static variable 
 with its classname i.e. DataObject.staticVar. 
 We don�t need to create any instance to access static variables. 
 It clearly shows that static variables belong to class scope.
 */

/*The most important thing about static variables is that they belong to class level.
 What it means is that there can be only one copy of variable in runtime.
 When you define a static variable in class definition, 
 each instance of class will have access to that single copy. 
 Separate instances of class will not have their own local copy, 
 like they have for non-static variables.*/