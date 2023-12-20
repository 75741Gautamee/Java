
public class Tester {

	public static void main(String[] args) {
		MathOperation obj = new MathOperation();
		
		obj.add(10, 20);
		obj.add(10, 20, 30);
		obj.add(10, 20.0);
		obj.add(10.0, 20);
		obj.add(10,20,30,40);
		obj.add(10,20,30,40,50);

	}

}
