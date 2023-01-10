package Variables;

class Student {
	   private int rno;
	   private String name;
	   public Student(int r, String n) {
	      rno = r;
	      name = n;
	   }
	   public void display() {
	      System.out.println("Roll Number: " + rno);
	      System.out.println("Name: " + name);
	   }
	}
	public class Demo {
	   public static void main(String[] args) {
	      Student s = new Student(173, "Susan");
	      s.display();
	   }
	}