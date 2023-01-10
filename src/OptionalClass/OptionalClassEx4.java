package OptionalClass;

import java.util.Optional;

public class OptionalClassEx4 {

	public static void main(String[] args) {
		Optional<String> gender = Optional.of("MALE");
		Optional<String> emptyGender = Optional.empty();
		if (gender.isPresent()) {
			System.out.println("value is available");

		} else {
			System.out.println("value not available");
		}

		gender.ifPresent(g -> System.out.println("In gender option, value available"));
		emptyGender.ifPresent(g -> System.out.println("In emptyGender option, value available"));

	}

}
