
public class ExerciseTwo {
	public static void main(String[] arg) {
		
		//create a class instance
		ExerciseTwo s = new ExerciseTwo();
		
		String a = "rahul";
		String b = "adriana";
		
		System.out.println(s.findFirstWord(a, b));
	}
	
	public String findFirstWord(String a, String b) {
	
	//convert Strings to array for iterating over
	char[] aArray = a.toCharArray();
	char[] bArray = b.toCharArray();
	
	 //loop through letters of each
	 for (int i = 0; i < aArray.length; i++) {
		 
	//if letter in a comes before b, then return a
		 if (aArray[i] < bArray[i]) {
			 return a;
			 
		 }
	//check if letter in b comes before a
	if (aArray[i] > bArray[i]) {
		 return b;
	}
	 //otherwise they are equal and you can move to the next letter
	
	 }
	return a;
	}
	
	

}
