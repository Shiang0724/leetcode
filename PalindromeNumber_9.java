package LeetCode;
import java.util.*;
//�S���ϥΦr�� 
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
		if(x>=0&&x<10) {	//���0-9���O�^��
			return true;
		} 
		if(x<0||x%10==0) {	//�t��,�Ӧ�ƬO0�����ŦX
			return false;
		}
		int x_reverse=0;
		while(x>x_reverse) {//��ƭȬ�b�����k �N�^��ȭ��Q�A�[�Wx���Ӧ��,x�A���H10
			pop=x%10;
			x_reverse=x_reverse*10+pop;
			x/=10;//�Ӧ�Ƥ���
		}
		//               �_�Ʒ|�h�@�Ӽƭ� ex:12321  123���H10�N�۵��F
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