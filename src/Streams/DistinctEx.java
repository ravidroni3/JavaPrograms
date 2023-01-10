package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctEx {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("a", "b", "c", "a", "d", "a");

		List list2 = list.stream().distinct().collect(Collectors.toList());
		System.out.println(list2);

	}

}
