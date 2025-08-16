package hw2;

public class Homework2_7 {

	public static void main(String args[]) {

//		方法一
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				if (i == 1) {
					System.out.print("A");
				}
				else if (i == 2){
					System.out.print("B");
				}
				else if (i == 3){
					System.out.print("C");
				}
				else if (i == 4){
					System.out.print("D");
				}
				else if (i == 5){
					System.out.print("E");
				}
				else{
					System.out.print("F");
				}
			}
			System.out.println();
		}
		
//		方法二
//		for (int i = 0; i < 6; i++) {
//			char letter = (char) ('A' + i); // 對應的英文字母
//			for (int j = 0; j <= i; j++) {
//				System.out.print(letter);
//			}
//			System.out.println(); // 換行
//		}
		
//		方法三
//		for (int i = 1; i <= 6; i++) {
//            if (i == 1) {
//                System.out.println("A");
//            } else if (i == 2) {
//                System.out.println("BB");
//            } else if (i == 3) {
//                System.out.println("CCC");
//            } else if (i == 4) {
//                System.out.println("DDDD");
//            } else if (i == 5) {
//                System.out.println("EEEEE");
//            } else if (i == 6) {
//                System.out.println("FFFFFF");
//            }
//        }

	}

}
