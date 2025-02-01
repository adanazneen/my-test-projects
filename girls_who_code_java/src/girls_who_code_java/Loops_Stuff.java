package girls_who_code_java;

public class Loops_Stuff {

	public static void main(String[] args) {
////BELOW IS HOW TO TURN A CHARACTER INTO AN INTEGER
//		int codePoint = (int) 'A';  // codePoint will be 65
//		System.out.println(codePoint);
		
////BELOW IS HOW TO TURN AN INTEGER INTO A CHARACTER
//		int codePoint1 = 97; 
//		String character = Character.toString(codePoint1); 
//		System.out.println(character); // Output: a
		
//THIS IS THE PRINTED THINGY MABOBBY BELOW
		int counter = 0;
		for (int t = 90; t >= 65; t--) {
			System.out.print(Character.toString(t));
			counter += 1;
			if (counter == 5) {
				System.out.print("\n");
				counter = 0;
			}
		}
		
//		int start = 0;
//		int end = 26;
//		int f = 90;
//		int maxThings = 5;
//		String letter = "";
//		
//		while (start < end) {
//			letter = letter + Character.toString(f);
//			f -= 1;
//			start += 1;
//			}
//		
//		
//		
//		for (int i = 0; i < letter.length(); i += maxThings) {
//			int endIndex = Math.min(i + maxThings, letter.length());
//			System.out.println(letter.substring(i, endIndex));
//			}
		
		
//THIS IS BASIC CODE FOR HOW TO SPLIT UP STRING LENGHTH	
//		String text = "This is a long string that needs to be split into multiple lines.";
//	    int maxCharsPerLine = 20;
//
//	    for (int i = 0; i < text.length(); i += maxCharsPerLine) {
//	    	int endIndex = Math.min(i + maxCharsPerLine, text.length());
//	    	System.out.println(text.substring(i, endIndex));
//			}
	    
	    
	    
	    
	    
	    
	}

}
