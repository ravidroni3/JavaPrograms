package StaticVariables;

public class StaticVariableDemo extends Object {
    public static void main(String[] args) {
        int a = 0;
        Students.setCollegeName("Gayatri");
        Students students = new Students();
        students.setId(20);
        students.setStandard(12);
        students.setStudentName("chandra shekhar");
        System.out.println("students : " + students + " College Name : " + Students.getCollegeName());
        Students.setCollegeName("Geetam");
        Students students2 = new Students();
        students2.setId(21);
        students2.setStandard(13);
        students2.setStudentName("Raju");
        System.out.println("students2 : " + students2.toString() + " College Name : " + Students.getCollegeName());
        Students students3 = new Students();
        students3.setId(22);
        students3.setStandard(14);
        students3.setStudentName("Rajesh");
        System.out.println("students3 : " + students3.toString() + " College Name : " + Students.getCollegeName());
        System.out.println("students : " + students.toString() + " College Name : " + Students.getCollegeName());
    }
}
class Students {
    static String collegeName;
    String studentName;
    int id;
    int standard;
    public static String getCollegeName() {
        return collegeName;
    }
    public static void setCollegeName(String collegeName) {
        Students.collegeName = collegeName;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getStandard() {
        return standard;
    }
    public void setStandard(int standard) {
        this.standard = standard;
    }
    @Override
    public String toString() {
        return "Students{" + "studentName=" + studentName + ", id=" + id + ", standard=" + standard + '}';
    }
}