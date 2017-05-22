package pallindrome;

public class PallindromeExecutor {

	public static void main(String[] args) {
		Pallindrome pallindrome = new Pallindrome();
		System.out.println(pallindrome.isPallindrome("rupanandha"));
		System.out.println(pallindrome.isPallindrome("anana"));
		System.out.println(pallindrome.isPallindrome(""));
		
		System.out.println(pallindrome.longestPalindrome("rupanandha"));
		
		

	}

}
