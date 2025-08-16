package hw1;

public class Homework1_3 {

	public static void main(String args[]) {

		int A1 = 256559;
		int Day = 24 * 60 * 60;
		int Hrs = 60 * 60;
		int Min = 60;

		System.out.print(A1 / Day + "天 ");
		System.out.print(A1 % Day / Hrs + "小時 ");
		System.out.print(A1 % Day % Hrs / Min + "分 ");
		System.out.println(A1 % Day % Hrs % Min + "秒");

	}

}
