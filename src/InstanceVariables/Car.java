package InstanceVariables;

public class Car {
    public static void main(String[] args) {
    Instance_ex cr = new Instance_ex();
      
    cr.setSpeed(100);
 
    System.out.println(cr.getSpeed());
 
    Instance_ex Audi = new Instance_ex();
 
    Audi.setSpeed(20);
 
    System.out.println(Audi.getSpeed());
 
}
} 