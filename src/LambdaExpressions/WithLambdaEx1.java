package LambdaExpressions;
//With Lambda Expression
interface Drawable1{  
    public void draw();  
}
public class WithLambdaEx1 {
	public static void main(String args[]) {
		int width=10;
		Drawable d2=()->{ System.out.println("Drawing "+width);  
        };  
        d2.draw();  
    }  
}  