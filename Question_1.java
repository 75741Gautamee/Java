import java.util.Scanner;

//Q.Write a program that accepts numbers continuously as long as the number is positive and prints the 
//sum of the given numbers.

public class Question_1 {

	public static void main(String[] args) {
		int num, sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Sum of Positive Numbers..");
		
		do {
			System.out.println("Enter The Number: ");
			num = sc.nextInt();
			if(num > 0)
				sum += num;
		} while(num > 0);
		
		if(sum > 0)
			System.out.println("The Sum is "+sum);
	}

}
