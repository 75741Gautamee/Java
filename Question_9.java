import java.util.Scanner;

//Q.Write a program to find factorial of a given number. ex:no5  fact=5*4*3*2*1=120

public class Question_9 {

	public static void main(String[] args) {
		int num, fact = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("To Find Factorial of a Given Number..");
		System.out.println("Enter The Number: ");
		num = sc.nextInt();
		
		for(int i = num; i > 0; i--) {
			fact = fact * i;
		}
		
		System.out.println("The Factorial of a Given Number is: "+fact);

	}

}
