package github;

class Calculation{
	
	int getSum(int a, int b) {
		return a+b;
	}
	
	int getSum(int a, int b, int c) {
		return a+b+c;
	}
}

public class Overloading {
	public static void main(String[] args) {
		Calculation cal  = new Calculation();
		
		int ans1 = cal.getSum(10, 20);
		int ans2 = cal.getSum(20, 20, 20);
		
		System.out.println("First ans : "+ans1);
		System.out.println("Second ans : "+ans2);
	}
}
