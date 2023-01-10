package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapEx {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> list2 = Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
		List<List<Integer>> nums = Arrays.asList(list1, list2);
		List<Integer> flatNumbers = nums.stream().flatMap(n -> n.stream()).collect(Collectors.toList());
		System.out.println(flatNumbers);
	}

}
