package hw3;

import java.util.Random;
import java.util.Scanner;

public class Homework3_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("請輸入你討厭哪個數字");
		int a = 1;
		int b = sc.nextInt();

		for (int c = 1; c <= 49; c++) {
			if (c / 10 == b || c % 10 == b) {
				continue;
			}
			System.out.print(c + " ");
			a++;
		}
		System.out.println("\n" + a + "個");
	}

}
