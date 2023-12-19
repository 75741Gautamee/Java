import java.util.Scanner;

//Q.Write a  program to find sum of all even and odd numbers between 1 to n.

public class Question_14 {

	public static void main(String[] args) {
		int num, sum_even = 0, sum_odd = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Sum of Even and Odd Numbers..");
		System.out.println("Enter The Number: ");
		num = sc.nextInt();
		
		for(int i = 0; i <= num; i++) {
			if(i % 2 == 0)
				sum_even += i;
			else
				sum_odd += i;
		}
		
		System.out.println("The Sum of All Even Numbers Between 1 To "+num+" is: "+sum_even);
		System.out.println("The Sum of All Odd Numbers Between 1 To "+num+" is: "+sum_odd);
		
	}

}
