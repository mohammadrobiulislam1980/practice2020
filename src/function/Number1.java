package function;

public class Number1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number1 p1=new Number1();
		p1.robi("I love java");
		p1.add(12, 8);

	}
	public void add(int a, int b) {
		int c=a+b;
		System.out.println("sum of int a and b is :::"+c);
	}
	public void robi(String a) {
		System.out.println("here is String we want to pring:::"+a);
		
	}

}
