package homedepot;

public class CallFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumofint(100);
		CallFunction a1=new CallFunction();
		a1.cl("i love you");
		a1.cl("I love java programm");
		

	}
	public static void sumofint (int a) {
		int sum=0;
		for (int i=0;i<=a;i++) {
			sum =sum+i;
			
		}
		System.out.println("here is sum of 1 to"+a+"is::::f  "+sum);
	}
	
	public static void cl (String b) {
		System.out.println("here is String we want to print :::  "+b);
	}


}
