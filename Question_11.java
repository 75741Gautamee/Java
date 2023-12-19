import java.util.Scanner;

//Q.Check if number is a prime number or not.:

public class Question_11 {

	public static void main(String[] args) {
		int num;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("To Check The Number is Prime or Not..");
		System.out.println("Enter The Number: ");
		num = sc.nextInt();
		
		for(int i=2; i < Math.sqrt(num)+1; i++) {
			if(num % i == 0) {
				flag = false;
				break;
			}
			else
				flag = true;
		}
		
		if(flag == true)
			System.out.println("The Number is a Prime Number");
		else 
			System.out.println("The Number is not a Prime Number");

	}

}
