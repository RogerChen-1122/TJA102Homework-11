package hw4;

import java.util.Arrays;

public class Homework4_1 {

	public static void main(String[] args) {

		int x[] = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15, };
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		System.out.println("平均值：" + (double)sum / x.length);

		System.out.println("大於平均值的數值：");
		
		Arrays.sort(x);
		for (int i = 0; i < x.length; i++) {
			if (x[i] > sum / x.length) {
				System.out.print(x[i] + " ");
			}
		}
	}

}
