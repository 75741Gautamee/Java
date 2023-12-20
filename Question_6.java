import java.util.Scanner;

//Q.Accept two numbers and calculate GCD of them.

public class Question_6 {

	public static void main(String[] args) {
		int num1, num2, min_num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("The GCD of Two Numbers..");
		System.out.println("Enter The First Number: ");
		num1 = sc.nextInt();
		System.out.println("Enter The Second Number: ");
		num2 = sc.nextInt();
		
		min_num = Math.min(num1, num2);
		
		while(min_num > 0) {
			if(num1 % min_num == 0 && num2 % min_num == 0)
				break;
			min_num--;
		}
		
		System.out.println("The GCD of "+num1+" and "+num2+" is "+min_num);
	}

}
