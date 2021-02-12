package leetCode;

public class PowerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x = 34.00515;
		int n = -3;
		double product = 1;
		PowerExample p = new PowerExample();
		
		if ((x<100 ||x > -100) && ((n>Integer.MIN_VALUE || n<Integer.MAX_VALUE))) {
			
			
			if (n%2==0) {
			product =	p.calculate(product, Math.abs(n/2),x);
			}
			else {
				product = p.calculate(x, ((Math.abs(n)-1)/2),x);
			}
			
		}
		
		if (n < 0) {
			product = 1/product;
		}
		
		System.out.println(product);
		
		
	}
	
	public double calculate(double product, int n, double x) {
		for (int i = 0; i < n; i++) {
			product = product * x*x;
		}
		return product;
	}

}
