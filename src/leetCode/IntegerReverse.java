package leetCode;

public class IntegerReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1534236469;
		
		int reverse=0;
		
		if (a>0) {
			while (a>0) {
				int r = a%10;
				reverse = (reverse  * 10) + r;
				a=a/10;	
			}
		}
		else {
			a=-a;
			while (a>0) {
				int r = a%10;
				reverse = (reverse  * 10) + r;
				a=a/10;	
			}
			reverse = - reverse;
		}
		
		if(reverse > (Math.pow(2.0, 31.0)-1))
			System.out.println("error");
		else
		System.out.println(reverse);
	}

}
