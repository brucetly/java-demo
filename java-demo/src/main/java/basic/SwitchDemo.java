package basic;

public class SwitchDemo {

	public static String test(String s) {
		String result = switch (s) {
		case "a" -> "hello";
		case "b" -> "world";
		case "c", "e", "g" -> "bye";
		default -> {
			yield "hello " + s;
		}
		};
		
		return result;
	}
}
