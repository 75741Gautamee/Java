package pkg1;

import java.util.Scanner;

public class Tester {
	public static void main(String args[]) {
	
		int choice = 0, element, value;
		int Array[] = {70, 30, 50, 20, 40, 10};
		
		Array_Class obj = new Array_Class();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------ARRAY-------");
		
		
		do {
			System.out.println("Enter The Choice: ");
			System.out.println("1. Show Array");
			System.out.println("2. Add Element in Array");
			System.out.println("3. Search Element in Array");
			System.out.println("4. Sort Array");
			System.out.println("5. Exit");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				obj.show_Array(Array);
				break;
			
			case 2:
				System.out.println("Enter The Element To Be Added: ");
				element = sc.nextInt();
				obj.add_Element(Array, element);
				break;
				
			case 3:
				System.out.println("Enter The Element To Be Searched: ");
				value = sc.nextInt();
				obj.search_Element(Array, value);
				break;
				
			case 4:
				obj.sort_Array(Array);
				break;
				
			default: 
				System.out.println("Exiting..");
				break;
			}
		}while(choice<5);
	
	}
}
