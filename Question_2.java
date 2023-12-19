import java.util.Scanner;

//Q.Write a program to do addition of two numbers

public class Question_2 {

	public static void main(String[] args) {
		
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("To Perform Addition Operation..");
		System.out.println("Enter The First Number: ");
		num1 = sc.nextInt();
		System.out.println("Enter The Second Number: ");
		num2 = sc.nextInt();
		
		System.out.println("The Adiition of Numbers is "+(num1+num2));

	}

}
