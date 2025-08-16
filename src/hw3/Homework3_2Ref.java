package hw3;

import java.util.Random;
import java.util.Scanner;

public class Homework3_2Ref {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int answer = random.nextInt(10);

		while (true) {
			System.out.println("開始猜數字吧！(0~9)");
			int guess = scanner.nextInt();

			if (guess == answer) {
				System.out.println("答對了！答案就是" + answer);
				break;
			} else if (answer >= 10 || answer < 0) {
				System.out.println("只能猜0~9喔！");
			} else {
				System.out.println("猜錯囉！");
			}
		}
		scanner.close();
	}

}
