package hw4;

public class Homework4_3 {

	public static void main(String[] args) {

		String planets[] = { 
				"mercury", "venus", "earth", "mars", 
				"jupiter", "saturn", "uranus", "neptune" 
				};
		int total = 0;
		
		for (int i = 0; i < planets.length; i++) {
			String planetString = planets[i];
			
			for (int j = 0; j < planetString.length(); j++) {
				char vowel = planetString.charAt(j);
				
				if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {
					total++;
				}
			}
		}
		System.out.println("總共有" + total + "個母音");
	}

}
