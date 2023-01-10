package LambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//Filter Collection Data
class ProductEx {
	int id;
	String name;
	float price;

	public ProductEx(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

}

public class FilterCollectionData {

	public static void main(String[] args) {
		List<ProductEx> list = new ArrayList<ProductEx>();
		list.add(new ProductEx(1, "Redmi", 10000f));
		list.add(new ProductEx(2, "Samsung", 70000f));
		list.add(new ProductEx(3, "Iphone", 90000f));
		list.add(new ProductEx(4, "Vivo", 20000f));

		Stream<ProductEx> s = list.stream().filter(p -> p.price > 60000);
		s.forEach(p -> System.out.println(p.name + ": " + p.price));
	}

}