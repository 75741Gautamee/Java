import java.util.Scanner;

//Q.Write a program to calculate factors of a given number.

public class Question_5 {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("To Calculate Factors..");
		System.out.println("Enter The Number: ");
		num = sc.nextInt();
		
		System.out.println("The Factors of "+num+" Are ");

		
		for(int i = 2; i < num; i++) {
			if(num % i == 0)
				System.out.println(+i+" ");
		}
			
	}

}
