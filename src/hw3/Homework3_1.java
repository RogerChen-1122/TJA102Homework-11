package hw3;

import java.util.Scanner;

public class Homework3_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input three number");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a != 0 && b != 0 && c != 0) {

			if (a + b > c && a + c > b && b + c > a) {

				if (a == b && b == c) {
					System.out.println("正三角形");

				} else if (a == b || a == c || b == c) {
					System.out.println("等腰三角形");

				} else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
					System.out.println("直角三角形");

				} else {
					System.out.println("一般三角形");
				}

			} else {
				System.out.println("不是三角形");
			}

		} else {
			System.out.println("不是三角形");
		}

	}

}
