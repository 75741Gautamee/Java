import java.util.Scanner;

//Q.Write a  program to enter a number and print its reverse.

public class Question_15 {

	public static void main(String[] args) {
		int num, num1, rem, rev = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("The Reverse of Number..");
		System.out.println("Enter The Number: ");
		num = sc.nextInt();
		
		num1 = num;
		
		while(num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		
		System.out.println("The Reverse of Number is: "+rev);

	}

}
