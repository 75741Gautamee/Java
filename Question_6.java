import java.util.Scanner;

//Q.Write a program, which accepts annual basic salary of an employee and calculates and displays the 
//Income tax as per the following rules. 
//Basic: < 1, 50,000 Tax = 0
// 1, 50,000 to 3,00,000 Tax = 20% 
// > 3,00,000 Tax = 30%

public class Question_6 {

	public static void main(String[] args) {
		int basic_salary;
		double tax = 0, total_salary = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("The Income Tax and Net Salary..");
		System.out.println("Enter Your Basic Salary: ");
		basic_salary = sc.nextInt();
		
		if(basic_salary < 150000) {
			tax = 0;
			total_salary = basic_salary - tax;
		}
		else if(150000 < basic_salary && basic_salary < 300000) {
			tax = basic_salary * 0.20;
			total_salary = basic_salary - tax;
		}
		else if(basic_salary > 300000) {
			tax = basic_salary * 0.30;
			total_salary = basic_salary - tax;
		}
		
		System.out.println("The Income Tax Payable By You is "+tax);
		System.out.println("Your Net Salary is "+total_salary);

	}

}

