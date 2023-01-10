package LambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class ForEachEx {

	public static void main(String[] args) {
		List<String> list =new ArrayList<String>();
		list.add("ram");
		list.add("raj");
		list.add("ajay");
		list.add("charan");
		list.add("anoop");
		
		list.forEach((i)->System.out.println(i));
		
		

	}

}
