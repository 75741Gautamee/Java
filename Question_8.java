import java.util.Scanner;

//Q.Write a C program to input angles of a triangle and check whether triangle is valid or not.

public class Question_8 {

	public static void main(String[] args) {
		int ang1, ang2, ang3, sum;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("To Check Triangle is valid or not..");
		System.out.println("Enter The First Angle of The Triangle: ");
		ang1 = sc.nextInt();
		System.out.println("Enter The Second Angle of The Triangle: ");
		ang2 = sc.nextInt();
		System.out.println("Enter The Third Angle of The Triangle: ");
		ang3 = sc.nextInt();
		
		sum = ang1 + ang2 + ang3;
		
		if(sum == 180)
			System.out.println("The Triangle is Valid");
		else
			System.out.println("The Triangle is Not Valid");

	}

}
