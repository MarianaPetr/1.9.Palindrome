import java.util.Scanner;

public class Palindrome {
	 String analysePalindrome(String str) {
		String str2="";
		for (int i = str.length(); i != 0; i--) {
			 str2 = str2 + str.charAt(i-1);
		  	}
		return str2;
  		}
	 
	String printPalindrome(String input, String inputReversed){
		return (input.compareTo(inputReversed)==0) ? "String '" + input + "' is a palindrome." : "String '" + input + "' is not a palindrome.";
	}

    public static void main(String[] args) {
    	Palindrome str=new Palindrome();
    	String input=str.AskUserForAString();
        System.out.println(str.printPalindrome(input, str.analysePalindrome(input)));
    } 
    
    
    String AskUserForAString() {
    	Scanner in= new Scanner(System.in);
    	System.out.println("Enter the string to analyse");
		return in.nextLine();
				
    }
}
