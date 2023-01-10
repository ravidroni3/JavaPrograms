package Variables;

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

public class JavaHungry
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
