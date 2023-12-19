import java.util.Scanner;

//Q.Write a program to swap two numbers.

public class Question_3 {

	public static void main(String[] args) {
		int num1, num2, temp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("To Perform Swapping Operation..");
		System.out.println("Enter The First Number: ");
		num1 = sc.nextInt();
		System.out.println("Enter The Second Number: ");
		num2 = sc.nextInt();
		
		System.out.println("The Numbers Before Swapping: "+num1+"   "+num2);
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("The Numbers After Swapping: "+num1+"   "+num2);

	}

}
