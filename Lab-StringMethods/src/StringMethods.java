
public class StringMethods {

	 public static void main(String[] args) {
	 String str = "Hello";
	 
	 System.out.println(str.equals("Hello"));
	 
	 String s = new String("Hello");
	   
	 System.out.println(str == s);
	 
	 System.out.println(str.equals(s));
	 
	  //use the length() method
	  System.out.println(str.length());
	  
	   //use the indexOf() method
	   System.out.println(str.indexOf('H'));
	   
	   //toUpperCase() - used to convert each letter to uppercase
	   str = str.toUpperCase();
	   System.out.println(str);
	   
	   //toLowerCase() - used to convert each letter to lowercase
	   str = str.toLowerCase();
	   System.out.println(str.toLowerCase());
	   

	   System.out.println(str.charAt(5));
	   
	   //equalsIgnoreCase - used to test if another String is equivalent regardless of capitalization
	   System.out.println(str.equalsIgnoreCase("THiS Is A nEW STRinG"));
	 }
}
