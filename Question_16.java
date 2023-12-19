import java.util.Scanner;

//Q.Write a  program to print all Prime numbers between 1 to n

public class Question_16 {

	public static void main(String[] args) {
		int num;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("To Print Prime Numbers..");
		System.out.println("Enter The Number: ");
		num = sc.nextInt();
		System.out.println("The Prime Numbers Upto "+num+" Are:");
		
		for(int j = 2; j <= num; j++) {
			for(int i=2; i < Math.sqrt(j)+1; ++i) {
				if(j % i == 0) {
					flag = false;
					break;
				}
				else
					flag = true;
			}
			if(flag == true)
				System.out.println(+j+" ");
		}
		
		

	}

}
