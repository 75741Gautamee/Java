import java.util.Scanner;

//Q.Write a program to find m to the power n. m=3 and n=4 so 3*3*3*3

public class Question_10 {

	public static void main(String[] args) {
		int m, n, pow = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("To Find m To The Power n ..");
		System.out.println("Enter The 'm': ");
		m = sc.nextInt();
		System.out.println("Enter The 'n': ");
		n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			pow = pow * m;
		}
		
		System.out.println("The "+m+" To The Power "+n+" is: "+pow);

	}

}
