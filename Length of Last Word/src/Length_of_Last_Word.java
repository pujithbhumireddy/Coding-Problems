import java.util.Arrays;

public class Length_of_Last_Word {

	public static void main(String[] args) {
		
		String s = "hello world";
		
		int len = 0;
		int i = s.length()-1;
		
		while(i >= 0 && s.charAt(i) == ' ')
		{
			i--;
		}
		
		while(i >=0 && s.charAt(i) != ' ')
		{
			len++;
			i--;
		}
		
		System.out.println(len);
		
		
	}

}
