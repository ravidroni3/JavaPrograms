package LambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//using comparator

class Product{
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
	
}

public class ComparatorEx {

	public static void main(String[] args) {
		
		List<Product>list = new ArrayList<Product>();
	     list.add(new Product(1,"HP Laptop",55000f)); 
	     list.add(new Product(2,"DELL",75000f));
	     list.add(new Product(3,"LENOVO",45000f));
	     
	     System.out.println("Printing List");
	     
	     Collections.sort(list,(p1,p2)->{return p1.name.compareTo(p2.name);});
	     for(Product p:list) {
	    	 System.out.println(p.id + " "+p .name+" "+p.price);
	     }
	     
		
		

	}

}
