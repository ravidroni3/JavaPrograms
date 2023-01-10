/**
 * 
 */
package CollectionFrameworks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListEx2 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		
		list.add("Giri");
		list.add("Ram");
		list.add("Pankaj");
		list.add("Ravi");
		list.add("Sai");
		list.add("Rajendar");
		list.add("Krishna");
		list.add("Sushil");
		list.add(null);
		list.add(null);
		
		list.get(6);
		System.out.println(list.get(6));
		
		list.addAll(list);
		System.out.println(list.addAll(list));
		System.out.println("******************");
		
	
	
		
		for(String name:list) {
			System.out.println("name :"+name);
		}
			
		/*	Iterator<String> itr = list.iterator();
			System.out.println();
			
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}*/
			
		
	}

	

	private static char[] list(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
