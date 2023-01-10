//instance variable
package InstanceVariables;

public class StudentsRecords  
{  
    /* declaration of instance variables. */  
    public String name; //public instance  
    String division;    //default instance  
    private int age;    //private instance  
    /* Constructor that initialize an instance variable. */  
    public StudentsRecords(String sname)  
    {  
        name = sname;  
    }  
  
    /* Method to intialize an instance variable. */  
    public void setDiv(String sdiv)  
    {  
        division = sdiv;  
    }  
      
    /* Method to intialize an instance variable. */  
    public void setAge(int sage)  
    {  
        this.age = sage;  
    }  
  
    /* Method to display the values of instance variables. */  
    public void printstud()  
    {  
        System.out.println("Student Name: " + name );  
        System.out.println("Student Division: " + division);   
        System.out.println("Student Age: " + age);  
    }  
  
    /* Driver Code */  
    public static void main(String args[])  
    {  
        StudentsRecords s = new StudentsRecords("Monica");  
        s.setAge(14);  
        s.setDiv("B");  
        s.printstud();  
    }  
}  