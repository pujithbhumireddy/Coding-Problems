
public class Palindrome_String {
	
	public static boolean isPalindromeString(String name) {
		
		if(name == "" && name.length() ==0)
			return false;
		
		int left = 0;
		int right = name.length()-1;
		
		while(left < right)
		{
			if(name.charAt(left) != name.charAt(right))
				return false;
			
			left++;
			right--;
		}
		
		return true;
	}
	
	public static void main(String[] args)
	{
		String name = "madam";
		
		if(isPalindromeString(name))
		{
			System.out.println(name+": it is a palindrome string");
		}else
		{
			System.out.println(name+": it is not a palindrome string");
		}
	}

}
