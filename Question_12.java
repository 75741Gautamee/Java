import java.util.Scanner;

//Q.Sum of series :
//	1+2+3+….+n

public class Question_12 {

	public static void main(String[] args) {
		int num, sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Sum of Series: ");
		System.out.println("Enter The Number: ");
		num = sc.nextInt();
		
		for(int i = 0; i <= num; i++) {
			sum = sum + i;
		}
		
		System.out.println("The Sum of The Series 1 + 2 + .. + "+num+" is: "+sum);

	}

}
