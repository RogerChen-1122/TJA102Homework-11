package hw3;

import java.util.Scanner;

public class Homework3_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("開始猜數字吧！(0~9)");
		int x = (int) (Math.random() * 10);

		while (true) {
			int y = sc.nextInt();
			if (x == y && 0 <= y && y < 10) {
				System.out.println("答對了！答案就是" + x);
				break;
			} else if (y >= 10 || y < 0) {
				System.out.println("只能猜0~9喔！");
			} else {
				System.out.println("猜錯囉！");
			}
		}
		sc.close();
	}

}
