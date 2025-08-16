package hw2;

public class Homework2_6 {

	public static void main(String args[]) {

		for (int y = 1; y <= 10; y++) {
			for (int x = 1; x <= 11-y; x++) {
				System.out.print(x);
			}
			System.out.println();
		}
	}

}
