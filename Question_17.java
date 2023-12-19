import java.util.Scanner;

//Q.Write a program to check entered number is Armstrong number or not.

public class Question_17 {

	public static void main(String[] args) {
		int num, num1, num2, rem, count_dig = 0, sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("To Check The Number is Armstrong or Not..");
		System.out.println("Enter The Number: ");
		num = sc.nextInt();
		
		num1 = num;
		num2 = num;
		
		while(num1 > 0) {
			num1 = num1 / 10;
			count_dig += 1;
		}
		
		while(num2 > 0) {
			rem = num2 % 10;
			sum += Math.pow(rem, count_dig);
			num2 = num2 / 10;
		}
		
		if(sum == num)
			System.out.println("The Number is Armstrong Number");
		else
			System.out.println("The Number is Not Armstrong Number");
		
	}

}
