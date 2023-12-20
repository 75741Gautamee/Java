import java.util.Scanner;

//Q.7. Write a menu driven program to do following operations :
//a) Compute area of circle
//b) Compute area of rectangle
//c) Compute area of triangle
//d) Exit
//Display menu, ask choice to the user, depending on choice accept the parameters and perform the 
//operation. Continue this process until user selects exit option.

public class Question_7 {

	public static void main(String[] args) {
		int choice, radius, length, breadth, height, side;
		double area;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------AREA-------");
		System.out.println("1. Compute The Area of Circle");
		System.out.println("2. Compute The Area of Rectangle");
		System.out.println("3. Compute The Area of Triangle");
		System.out.println("4. Exit");
		System.out.println("Enter The Choice: ");
		choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Area of Circle..");
				System.out.println("Enter The Radius: ");
				radius = sc.nextInt();
				area = 3.14 * Math.pow(radius, 2);
				System.out.println("The Area of Circle is "+area);
				break;
			
			case 2:
				System.out.println("Area of Rectangle..");
				System.out.println("Enter The Length: ");
				length = sc.nextInt();
				System.out.println("Enter The Breadth: ");
				breadth = sc.nextInt();
				area = length * breadth;
				System.out.println("The Area of Rectangle is "+area);
				break;
				
			case 3:
				System.out.println("Area of Triangle..");
				System.out.println("Enter The Height: ");
				height = sc.nextInt();
				System.out.println("Enter The Side: ");
				side = sc.nextInt();
				area = 0.5 * height * side;
				System.out.println("The Area of Triangle is "+area);
				break;
				
			case 4: 
				System.out.println("Exiting..");
				break;
				
			default:
				System.out.println("Invalid Choice..");
			}
		

	}

}
