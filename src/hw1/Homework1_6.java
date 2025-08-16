package hw1;

public class Homework1_6 {

	public static void main(String arg[]) {

		System.out.println(5 + 5); // 10，單純數字運算
		System.out.println(5 + '5'); // 58
//		System.out.println('5' + 5); // 58，同上答案
		// '5'為char 5，其對應Unicode十進制的編碼值為53(int)
		// 故 int 5 + char 5 = 5 + 53 = 58
		System.out.println(5 + "5"); // 55，數字5與字串5的串接，整體視為字串

	}

}
