package CollectionFrameworks;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(1);
			list.add(3);
			list.add(5);
			list.add(7);
			list.add(9);
			
			Collections.sort(list);
			
			for(Integer num:list) {
				System.out.println(list);
			}
			
			
			
			
		}

	}


