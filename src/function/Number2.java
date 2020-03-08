package function;

public class Number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumofint(50);
		Number2 d1=new Number2();
		d1.cl("I am learnig Java");
		sumofint(15);

	}
	
	public static void sumofint (int a) {
		int sum=0;
		for (int i=0;i<=a;i++) {
			sum =sum+i;
			
		}
		System.out.println("here is sum of 1 to "+a+" is::::  "+sum);
	}
	public static void cl (String b) {
		System.out.println("here is String we want to print :::  "+b);
	}


}
