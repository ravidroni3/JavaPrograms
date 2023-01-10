package OptionalClass;
import java.util.Optional;

public class OptionalClassEx1 {

	public static void main(String[] args) {
		Optional<String> gender = Optional.of("MALE");
		String ans1 = "yes";
		String ans2 = null;
		System.out.println("non-empty optional" + gender);
		System.out.println("non-empty optional:GenderValue" + gender.get());
		System.out.println("empty optional:" + Optional.empty());
		System.out.println("of nullable on non-empty optional:" + Optional.ofNullable(ans1));
		System.out.println("of nullable on empty optional:" + Optional.ofNullable(ans2));

	}

}
