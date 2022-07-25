package week2.day1;

public class Calculator {
	public int add(int a,int b)  {
		int c=a+b;
		return c;
	}
	public int sub(int e,int f) {
		return e-f;
	}
	public double multiply(double i, double j) {
		return i*j;
	}
	public float divide(float x,float y) {
		return x/y;
	}
	public static void main(String[] args) {
	Calculator calc=new Calculator();
	int add=calc.add(25,25);
	System.out.println(add);
	int sub=calc.sub(25,20);
	System.out.println(sub);
	double multiple=calc.multiply(2,5);
	System.out.println(multiple);
	float divide=calc.divide(25f,5f);
	System.out.println(divide+"f");
	}

}
