package hw4;

public class Homework4_2 {

	public static void main(String[] args) {

		String forward = "Hello World";
		String reverse = "";

		for (int i = forward.length() - 1; i >= 0; i--) {
			reverse += forward.charAt(i);
		}
		System.out.println(reverse);
	}

}
