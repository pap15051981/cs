class StringSearch {
	
	public static void main(String[] argv) {
		String s1 = argv[0];
		String s2 = argv[1];

		int matchIndex = findString3(s1,s2);
		
		System.out.println(s1 );		
		System.out.println(s2 );		
		System.out.println(matchIndex);		

	}


	static int  findString1(String s1, String s2) {
		int i=0, j=0, matchIndex = -1;	

		while(i<s1.length()) {
			j=0;	

			while(j<s2.length()) {
				if (s1.charAt(i) == s2.charAt(j)) {
					i++;
					j++;
				}
				else {
					j=0;
					i++;
					break;
				}
			}

			if (j == s2.length()) {
				matchIndex = i-j;
				break;
			}

			i++;
		}

		return matchIndex;
	}

	static int findString2(String s1, String s2) {
		int i=0, j=0, matchIndex = -1;	

		while(i<s1.length()) {
			j=0;	
			while(s1.charAt(i) == s2.charAt(j)) {

				j++;
				i++;

				if (j == s2.length()) {
					matchIndex = i-j;
					return matchIndex;
				}

			}
			i++;
		}
		return matchIndex;
	}	
	
	static int findString3(String s1, String s2) {
		int i=0, j=0, matchIndex = -1;	

		while(i<s1.length()) {
			if(s1.charAt(i) == s2.charAt(j)) {

				j++;
				i++;


			}
			else {
				j=0;	
				i++;
			}

			if (j == s2.length()) {
				matchIndex = i-j;
				break;
			}

		}
		return matchIndex;
	}	
	
}

