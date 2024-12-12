
public class Reverse_Integer {

	public static void main(String[] args) {
		int num = -121;
		
		num = Math.abs(num);
		int sign = (num < 0) ? -1 : 1;
		int rev = 0;

		while (num > 0) {

			int remainder = num % 10;
			rev = rev * 10 + remainder;
			num = num / 10;

		}
		
		System.out.println(rev*sign);
	}

}
