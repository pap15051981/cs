public class BiggestPalindrome {

	public static void main(String[] argv) {
		String s1 = argv[0];

		System.out.println("plaindrome :" + findPalindrome(s1));
	}

	static String findPalindrome(String s) {

		String result="";
		int i=0;
		while(i<s.length()) {
			int m=1;
			String match ="";
			while((i-m) >= 0  && (i+m) < s.length()  && s.charAt(i-m) == s.charAt(i+m) ) {
				match = s.substring((i-m),(i+m)+1);
				if (match.length() > result.length()) {
					result = match;
				}
				if (m == i) {
					break;
				}
				else {
					m++;
				}
			}
			i++;
		}
		return result;
	}	


}
