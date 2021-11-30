package LeetCode;
import java.util.*;
//⊿Τㄏノ﹃ 
public class PalindromeNumber_9 {
	public static void main(String[] args) {
		PalindromeNumber pn=new PalindromeNumber(); 
		boolean isPalindrome=pn.isPalindrome(1211112);
		System.out.println(isPalindrome);
	}
} 
class PalindromeNumber{
	public boolean isPalindrome(int x) {
		int pop;
		if(x>=0&&x<10) {	//俱计0-9常琌ゅ
			return true;
		} 
		if(x<0||x%10==0) {	//璽腹,计琌0常ぃ才
			return false;
		}
		int x_reverse=0;
		while(x>x_reverse) {//р计暗猭 盢ゅx计,x埃10
			pop=x%10;
			x_reverse=x_reverse*10+pop;
			x/=10;//计ぃǎ
		}
		//               计穦计 ex:12321  123埃10碞单
		if(x==x_reverse||x==x_reverse/10) {
			return true;
		}else {
			return false;
		}
	}
}
//12321
//1232   1
//123   12
//12   123(/10)