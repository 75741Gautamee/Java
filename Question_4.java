import java.util.Scanner;

//Q.Write a program to accept an integer and check if it is even or odd.

public class Question_4 {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("To Check The Number is EVEN or ODD..");
		System.out.println("Enter The Number: ");
		num = sc.nextInt();
		
		if(num % 2 == 0)
			System.out.println("The Number is EVEN");
		else
			System.out.println("The Number is ODD");

	}

}
