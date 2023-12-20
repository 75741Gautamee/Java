import java.util.Scanner;

//Q.Write a program to accept a character, an integer n and display the next n characters.

public class Question_3 {

	public static void main(String[] args) {
		char ch;
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("To Display The Next n Characters..");
		System.out.println("Enter The Character: ");
		ch = sc.next().charAt(0);
		System.out.println("Enter The Integer n: ");
		n = sc.nextInt();
		
		System.out.println("The Next "+n+" Characters of "+ch+" Are: ");
		
		int nextInt_ch = (int)ch;
		
		for(int i = 0; i < n; i++) {
			nextInt_ch += 1;
			char nextChar_ch = (char)nextInt_ch;
			System.out.println(+nextChar_ch+" ");
		}

	}

}
