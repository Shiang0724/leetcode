package LeetCode;

import java.util.*;

public class ValidAnagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s="car";
		String t="rca";
		boolean result=isAnagram(s,t);
		System.out.println();
		System.out.println(result);
	}
	public static boolean isAnagram(String s,String t) {
		int letters[]=new int[26];
		for(int i=0;i<s.length();i++) {
			letters[s.charAt(i)-'a']++;
			letters[t.charAt(i)-'a']--;
		}
		
		
//		for(int i=0;i<letters.length;i++) {
//			if(letters[i]!=0) {
//				return false;
//			}else {
//				return true;
//			}
//		}
		for(int i:letters) {
			if(i!=0) {
				return false;
			}
		}
		for(int i=0;i<letters.length;i++) {
			System.out.print(letters[i]);
		}
		return true;
	}
}
