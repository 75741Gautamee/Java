
//Q.1:Create MathOperation class,create overloaded  add method for accepting different data type and show addition (use:Function Overloading)
//Write method accepting variable arguments of type int and show sum of all elements(use:varargs)

//Create tester class and call methods from MathOperation class.

public class MathOperation {
	public void add(int num1, int num2) {
		System.out.println("Addition[add(int,int)] "+(num1+num2));
	}
	
	public void add(int num1, int num2, int num3) {
		System.out.println("Addition[add(int,int,int)] "+(num1+num2+num3));
	}
	
	public void add(double num1, int num2) {
		System.out.println("Addition[add(double,int)] "+(num1+num2));
	}
	
	public void add(int num1, double num2) {
		System.out.println("Addition[add(int,double)] "+(num1+num2));
	}
	
	public void add(int... num1) {
		int total = 0;
		for(int i = 0; i < num1.length; i++) {
			total += num1[i];
		}
		System.out.println("The Addition[add(int...)] "+total);
	}
	
}
