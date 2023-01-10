package StringBuilder;

//The default capacity is 16. 
//When the number of characters exceeds 16,
//it increases the capacity to n*2+2, where n is the current capacity. 
/*Using the Capacity() Method*/
public class StringBuilderCapacity {

	public static void main(String[] args) {
		StringBuilder cap = new StringBuilder("Wellcome");
		System.out.println("Capacity " +cap.capacity());

	}

}
