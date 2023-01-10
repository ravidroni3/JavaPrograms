package StaticVariables;

public class Student
{
  //Declaring static variables inside the class
  public static int marks;
  public static String studentName = "John";

  public static void main(String args[])
  {
    //accessing static variable without creating object
    Student.marks = 80;
    System.out.println("The marks of student "+Student.studentName +"are:     "+Student.marks);

    //creating 3 objects of the class
    Student student1 = new Student();
    Student student2 = new Student();
    Student student3 = new Student();

    //Accessing the statc variable through objects
    System.out.println(student1.studentName);
    System.out.println(student2.studentName);
    System.out.println(student3.studentName);

    //We can directly access the static variable like this
    System.out.println(marks);

    //changing the value of the static variable by 1 object
    student1.studentName= "Sam";

    // change made by one object is reflected to all other objects
    System.out.println(student1.studentName);
    System.out.println(student2.studentName);
    System.out.println(student3.studentName);
  }
}