//instance variable

package InstanceVariables;

class InstanceExample
{
    /* Below variable is Instance variable as it 
    is inside the class and outside the method
    declaration. It is not using STATIC 
    keyword and using default access modifier*/
    // Declaring Instance Variable
    int instanceVariable;
    
    //Constructor for InstanceExample Class
    InstanceExample(int num)
    {
        this.instanceVariable = num;
    }
    
    //Method to display Instance Variable
    void printInstanceVariable()
    {
        System.out.println("Value of Instance Variable is "+instanceVariable);
    }
    
}

public class InstanceVariableEx
{
    public static void main(String args[])
    {
        //Creating object of InstanceExample Class
        InstanceExample ob1 = new InstanceExample(5);
        InstanceExample ob2 = new InstanceExample(10); 
 
        //Calling printInstanceVariable() for each object
        ob1.printInstanceVariable();
        ob2.printInstanceVariable();
    }
}

/*
Instance variables are defined inside a class but outside any method declaration. 
These variables are defined without the static keyword and are only initialized 
when the class is instantiated i.e. object of that class is created. 
These variables belong to each unique object and have scope 
only within that object i.e not shared among instances.*/
/*
 *Rules Associated With Instance Variable in Java
Instance variable can use any access modifiers (private, public, protected, or default).

Instance variable can be marked final

Instance variable can be marked transient

Instance variable cannot be marked static otherwise it will become a class variable.

Instance variable cannot be marked abstract

Instance variable cannot be marked synchronized

Instance variable cannot be marked strictfp

Instance variable cannot be marked native

Note: Any variable which is marked as static is called Class Variable because it has scope within the class.

Important Points About Instance Variable in Java
Instance variables belong to each unique object of the class.

Instance variables are created only when a new object is created using a 'new' keyword in Java.

Instance variables associated with an object are destroyed once the object is destroyed.

Instance variables will have a default value if not initialized.

 */
