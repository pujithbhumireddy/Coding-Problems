
public class Armstrong_Numbers {
	
	/*
	 * Armstrong Numbers 
	 * You are given a 3-digit number n, Find whether it is an Armstrong number or not.
	 * 
	 * An Armstrong number of three digits is a number such that the sum of the
	 * cubes of its digits is equal to the number itself. 371 is an Armstrong number
	 * since 33 + 73 + 13 = 371.
	 * 
	 */
	
	public static void main(String[] args) {
		int num = 407; // armstrong numbers = , 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208,9474
		int temp = num;
		int power = iscounter(num);
		int sum = 0;

		while (num > 0) {
			int remainder = num % 10;
			sum += Math.pow(remainder, power);
			num = num / 10;
		}

		if (sum == temp) {
			System.out.println(temp + ": is an armstrong number");
		} else {
			System.out.println(temp + ": is not an armstrong number");
		}

	}

	public static int iscounter(int num) {
		int count = 0;

		while (num > 0) {
			count = count + 1;
			num = num / 10;
		}

		return count;
	}

}
