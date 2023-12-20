import java.util.Scanner;

//Q.Write a program to accept two integers x and n and compute x raised to n.

public class Question_2 {

	public static void main(String[] args) {
		int x, n; 
		double pow = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("To Compute x Raised To n..");
		System.out.println("Enter The x: ");
		x = sc.nextInt();
		System.out.println("Enter The n: ");
		n = sc.nextInt();
		
		pow = Math.pow(x, n);
		
		System.out.println("The "+x+" Raised To "+n+" is: "+pow);

	}

}
