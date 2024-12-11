
public class Palindrome_Number {

	public static boolean isPalindrome(int num) {
		int temp = num;
		int sum = 0;
		while (num != 0) {
			int remainder = num % 10;
			sum = sum * 10 + remainder;
			num = num / 10;
		}

		if (sum != temp)
			return false;

		return true;
	}

	public static void main(String[] args) {
		int num = 121;

		if (isPalindrome(num)) {
			System.out.println(num + ": the number is a palindrome number");
		} else {
			System.out.println(num + ": the number is not a palindrome number");
		}
	}

}
