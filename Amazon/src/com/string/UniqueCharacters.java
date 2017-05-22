package com.string;

public class UniqueCharacters {

	public static void main(String[] args) {
		UniqueCharacters uc = new UniqueCharacters();
		uc.unique("rupananadha");

	}

	public int unique(String s) {

		int freq[] = new int[256];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
		//	System.out.println(c-'a' +" " +c);
			freq[c - 'a']++;
		}
		
		
		for (int i = 0; i < s.length(); i++)
			if (freq[s.charAt(i) - 'a'] == 1)
				return i;
		return -1;

	}
}