package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text="MADAM";
		char[] charArray = text.toCharArray();
		String reverse="";
		
		for ( int i = charArray.length-1; i >=0; i--) {
			reverse=reverse+charArray[i];
		}
		if(text.equalsIgnoreCase(reverse))
		{
			System.out.println(text + " is a palindrome");
			
		}
		else 
			System.out.println(text + " is not a palindrome");

	}

}
