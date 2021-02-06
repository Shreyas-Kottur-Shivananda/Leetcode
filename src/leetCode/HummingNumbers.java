package leetCode;

public class HummingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =Integer.parseUnsignedInt("0010000");
		int count=0;

		while(n>0) {
			int b = (int) (n%10);
			if (b == 1) {
				count++;
			}
			
			n=n/10;
		}

		System.out.println("Count is "+count);
	}

}
