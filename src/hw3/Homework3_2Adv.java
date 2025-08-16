package hw3;

import java.util.Scanner;

public class Homework3_2Adv {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("開始猜數字吧");
		int x = (int) (Math.random() * 101);

		while (true) {
			int y = sc.nextInt();
			if (x == y && 0 <= y && y <= 100) {
				System.out.println("答對了！答案就是" + x);
				break;
			} else if (y > 100 || y < 0) {
				System.out.println("只能猜0~9喔！");
			} else if (0 <= y && y <= x) {
				System.out.println("太小囉！");
			} else if (x <= y && y <= 100) {
				System.out.println("太大囉！");
			}
		}
		sc.close();
	}

}
