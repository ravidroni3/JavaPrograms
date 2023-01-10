package OptionalClass;

import java.util.Optional;

public class OptionalClassEx3 {

	public static void main(String[] args) {
		Optional<String> gender = Optional.of("MALE");
		Optional<String> emptyGenderOptional = Optional.empty();
		System.out.println(gender.filter(g -> g.equals("male")));
		System.out.println(gender.filter(g -> g.equalsIgnoreCase("male")));
		System.out.println(emptyGenderOptional.filter(g -> g.equalsIgnoreCase("MALE")));

	}

}
