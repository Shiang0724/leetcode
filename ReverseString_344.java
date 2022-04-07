package LeetCode;

import java.util.Scanner;

public class ReverseString_344 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s[]=new String[] {"h","e","l","l","o"};
		for(int i=0;i<s.length/2;i++) {
			String tmp=s[i];
			s[i]=s[s.length-1-i];
			s[s.length-1-i]=tmp;
		}
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]);
		}
	}

}
