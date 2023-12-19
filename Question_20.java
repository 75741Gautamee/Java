import java.util.Scanner;

//Q.Accept a single digit from the user and display it in words. 
//For example, if digit entered is 9, display Nine.

public class Question_20 {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digit in Word..");
		System.out.println("Enter The Number: ");
		num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		case 4:
			System.out.println("FOUR");
			break;
		case 5:
			System.out.println("FIVE");
			break;
		case 6:
			System.out.println("SIX");
			break;
		case 7:
			System.out.println("SEVEN");
			break;
		case 8:
			System.out.println("EIGHT");
			break;
		case 9:
			System.out.println("NINE");
			break;
		default:
			System.out.println("Please Enter Valid Number..");
		}

	}

}
