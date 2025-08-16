package hw1;

public class Homework1_5 {

	public static void main(String args[]) {

		double pv = 1500000;
		double fv = pv * Math.pow((1 + 0.02), 10);

		System.out.println(fv + "元");
		System.out.printf("%.2f" + "元" + "%n", +fv);
		System.out.printf("%.2f", fv);
//		System.out.printf("%.2f",fv + "元"); //報錯
//		System.out.printf(fv + "%.2f" + "元",); //報錯
//		System.out.printf("%.2f", + "元" +fv); //報錯

	}

}
