import java.util.Scanner;

//Q.Create menu driven program for Pizza Shop.And display total amount

public class Question_19 {

	public static void main(String[] args) {
		int choice, quantity, price, total;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------PIZZA SHOP----------");
		System.out.println("1. MARGARITA");
		System.out.println("2. CHEESE & CORN");
		System.out.println("3. ASSORTED VEG");
		System.out.println("4. MUSHROOMITA");
		System.out.println("5. CRISPY CHICKEN");
		System.out.println("Enter Your Choice: ");
		choice = sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Please Provide The Quantity: ");
			quantity = sc.nextInt();
			price = 90;
			total = quantity * price;
			System.out.println("Your Bill is "+total);
			break;
		}
		case 2:{
			System.out.println("Please Provide The Quantity: ");
			quantity = sc.nextInt();
			price = 100;
			total = quantity * price;
			System.out.println("Your Bill is "+total);
			break;
		}
		case 3:{
			System.out.println("Please Provide The Quantity: ");
			quantity = sc.nextInt();
			price = 110;
			total = quantity * price;
			System.out.println("Your Bill is "+total);
			break;
		}
		case 4:{
			System.out.println("Please Provide The Quantity: ");
			quantity = sc.nextInt();
			price = 120;
			total = quantity * price;
			System.out.println("Your Bill is "+total);
			break;
		}
		case 5:{
			System.out.println("Please Provide The Quantity: ");
			quantity = sc.nextInt();
			price = 150;
			total = quantity * price;
			System.out.println("Your Bill is "+total);
			break;
		}
		}
	}

}
