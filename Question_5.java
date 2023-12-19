import java.util.Scanner;

//Q.Write a program to accept a number and check if it is divisible by 5 and 7.

public class Question_5 {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("To Check The Number is Divisible Or Not Divisible By 5 and 7..");
		
		System.out.println("Enter The Number: ");
		num = sc.nextInt();
		
		if(num % 5 == 0 && num % 7 == 0)
			System.out.println("The Number is Divisible By 5 and 7");
		else
			System.out.println("The Number is Not Divisible By 5 & 7");

	}

}
