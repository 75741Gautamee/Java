import java.util.Scanner;

//Q.Write a program to find greatest of three numbers using nested if-else.

public class Question_18 {

	public static void main(String[] args) {
		int num1, num2, num3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("The Greatest Number..");
		System.out.println("Enter The First Number: ");
		num1 = sc.nextInt();
		System.out.println("Enter The Second Number: ");
		num2 = sc.nextInt();
		System.out.println("Enter The Third Number: ");
		num3 = sc.nextInt();
		
		if(num1 > num2) {
			if(num1 > num3)
				System.out.println("The Greatest Number is: "+num1);
			else
				System.out.println("The Greatest Number is: "+num3);
		}
		else if(num2 > num3) 
			System.out.println("The Greatest Number is: "+num2);
		else 
			System.out.println("The Greatest Number is: "+num3);

	}

}
