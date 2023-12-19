import java.util.Scanner;

//Q.Write a program, which accepts two integers and an operator as a character (+ - * / ), 
//performs the corresponding operation and displays the result.

public class Question_21 {

	public static void main(String[] args) {
		int num1, num2;
		char operator;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Mathematical Operation..");
		System.out.println("Enter The First Operand: ");
		num1 = sc.nextInt();
		System.out.println("Enter The Second Operator: ");
		num2 = sc.nextInt();
		System.out.println("Enter The Operator(+ - * /): ");
		operator = sc.next().charAt(0);
		
		switch(operator) {
		case '+':
			System.out.println("The Addition is "+(num1 + num2));
			break;
		case '-':
			System.out.println("The Subtraction is "+(num1 - num2));
			break;
		case '*':
			System.out.println("The Multiplication is "+(num1 * num2));
			break;
		case '/':
			System.out.println("The Division is "+(num1 / num2));
			break;
		}

	}

}
