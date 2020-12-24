
public class AlphabetArray {
	public static void main(String[] args) {
		
		//create a class instance
		AlphabetArray a = new AlphabetArray();
		
		//call the method
		char[] alpha = a.getAlphabetArray();
		System.out.println(alpha);
	}
	
	public char[] getAlphabetArray() {
		char[] letters = {
				'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
		};
		return letters;
	}

}
