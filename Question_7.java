import java.util.Scanner;

//Q.Accept a lowercase character from the user and check whether the character is a vowel or consonant. 
//(Hint: a, e, i, o, u are vowels)

public class Question_7 {

	public static void main(String[] args) {
		char ch;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("To Check Character is a VOWEL or CONSONANT..");
		System.out.println("Enter The LOWERCASE Character: ");
		ch = sc.next().charAt(0);
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
			System.out.println("The Character is a VOWEL");
		else
			System.out.println("The Character is a CONSONANT");
			
		

	}

}
