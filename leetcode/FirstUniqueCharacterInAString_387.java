package LeetCode;
import java.util.*;
public class FirstUniqueCharacterInAString_387 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s="loveleetcode";
		int alphabets[]=new int[26];
		for(int i=0;i<s.length();i++) {
			alphabets[s.charAt(i)-'a']++;
		}
		for(int i=0;i<alphabets.length;i++) {
			System.out.print(alphabets[i]);
		}
		for(int i=0;i<alphabets.length;i++) {
			if(alphabets[s.charAt(i)-'a']==1) {
				System.out.println(i);
				break;
			}
		}
	}

}
