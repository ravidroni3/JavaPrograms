package InstanceVariables;

public class AreaOfShapes
{
  //Declaring instance variables
  double breadth;
  double length;
  double areaOfRectangle;
  double areaOfSquare;

  public static void main(String args[])
  {
      //Creating First Object area1
      AreaOfShapes area1 = new AreaOfShapes();
      //Accessing instance variables through the first object
      area1.length = 50;
      area1.breadth = 25;
      area1.areaOfRectangle= area1.length * area1.breadth;

      //Displaying details for first object
      System.out.println("Details from the first object-");
      System.out.println("Length of Rectangle: " +area1.length);
      System.out.println("Breadth of Rectangle: " +area1.breadth);
      System.out.println("Area of Rectangle: " +area1.areaOfRectangle);

      //Creating second Object area2
      AreaOfShapes area2 = new AreaOfShapes();
      //Accessing instance variables through the second object
      area2.length = 75.5;
      area2.breadth = 68;
      area2.areaOfRectangle= area2.length * area2.breadth;

      //Displaying details for the second object
      System.out.println("\nDetails from the second object-");
      System.out.println("Length of Rectangle: " +area2.length);
      System.out.println("Breadth of Rectangle: " +area2.breadth);
      System.out.println("Area of Rectangle: " +area2.areaOfRectangle);
  }
}