package LeetCode;
import java.util.*;
public class RansomNote {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ransomNote="aacc";
		String magazine="aaccd";
		boolean result=canConstruct(ransomNote,magazine);
		System.out.println(result);
	}
	public static boolean canConstruct(String ransomNote,String magazine) {
		int alphabets[]=new int[26];
		for(int i=0;i<magazine.length();i++) {
			alphabets[magazine.charAt(i)-'a']++;
		}
//		for(int i=0;i<alphabets.length;i++) {
//			System.out.print(alphabets[i]);
//		}
		System.out.println();
		for(int i=0;i<ransomNote.length();i++) {
			if(--alphabets[ransomNote.charAt(i)-'a']<0) {
				return false;
			}
		}
		return true;
	}
}
