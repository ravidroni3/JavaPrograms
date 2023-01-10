package StringBuilder;
//StringBuilder in Java is a class used to create a mutable, 
//or in other words, a modifiable succession of characters. 
//StringBuilder is non-synchronized i.e. not thread safe. 
//It means two threads can call the methods of StringBuilder simultaneously.

/*Applying the Append() Method */
public class StringBuilderEx {

	public static void main(String[] args) throws Exception{
		StringBuilder builder =new StringBuilder();
		builder.append("Hi");
		builder.append(" Welcome");
		System.out.println(builder);
		builder.append("to Java");
		System.out.println(builder);

	}

}
