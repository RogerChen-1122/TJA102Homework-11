package hw2;

public class Homework2_5 {

	public static void main(String args[]) {

		int a;
		int b = 1;
		for (a = 1; a <= 49; a++) {
			if (a / 10 == 4 || a % 10 == 4) {
				continue;
			}
			System.out.print(a + " ");
			b++;
		}
//		System.out.println();
		System.out.println("\n" + b + "個");
	}

}
