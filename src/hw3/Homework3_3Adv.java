package hw3;

import java.util.Scanner;

public class Homework3_3Adv {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("請輸入你討厭哪個數字");
		int a = 1;
		int b = sc.nextInt();

		while (a++ <= 6) {
			int c = (int) (Math.random() * 49 + 1);
			if (c / 10 == b || c % 10 == b) {
				continue;
			}
			System.out.print(c + " ");
		}

	}

}
