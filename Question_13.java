import java.util.Scanner;

//Q.Check whether the number is palindrome or not?

public class Question_13 {

	public static void main(String[] args) {
		int num, num1, rem, rev = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("To Check The Number is Palindrome or Not..");
		System.out.println("Enter The Number: ");
		num = sc.nextInt();
		
		num1 = num;
		
		while(num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		
		if(num1 == rev) 
			System.out.println("The Number is Palindrome");
		else
			System.out.println("The Number is Not Palindrome");

	}

}
