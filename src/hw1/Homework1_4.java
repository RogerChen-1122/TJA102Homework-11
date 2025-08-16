package hw1;

public class Homework1_4 {

	public static void main(String args[]) {

		double pi = 3.1415;
		int r = 5;

		System.out.printf("圓面積 = " + "%.4f", pi * Math.pow(r, 2));
		System.out.println();
		System.out.printf("圓周長 = " + "%.4f", 2 * pi * r);
//		System.out.println(Math.round(pi * Math.pow(r, 2)));
//		System.out.println(Math.round(2 * pi * r));

	}	

}
