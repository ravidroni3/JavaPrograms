package InstanceVariables;

public class Instance {
    
    // Declaring instance variables
        public int rollNum; 
        public String name; 
        public int totalMarks;
        public int number;
     
    public static void main(String[] args) {
         
        // created object
        Instance in = new Instance();
        in.rollNum = 95;
        in.name = "Saket";
        in.totalMarks = 480;
         
        // printing the created objects
        System.out.println(in.rollNum);
        System.out.println(in.name);
        System.out.println(in.totalMarks);
         
        /*
         * we did not assign the value to number so it 
         * will print '0' by default
         */
        System.out.println(in.number);
 
    }
 
}