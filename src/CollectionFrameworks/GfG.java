package CollectionFrameworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GfG {

	// Main driver method
    public static void main(String[] args)
    {
 
    	List<Integer> list = new ArrayList<Integer>();
    	list.add(1);
    	list.add(2);
    	list.add(3);
    	list.add(4);
    	list.add(1, 5);
    	
    	Collections.sort(list);   
    	
  
    	for(Integer val:list) {
    		System.out.println(val);
    	}
    	
       
    }
}
