package LeetCode;

public class ReverseInteger_7 {

	public static void main(String[] args) {
		ReverseInteger ri=new ReverseInteger();
		int a=ri.Reverse(153457);
		System.out.println(a);
	}
}
class ReverseInteger{
	public int Reverse(int x) {
		if(x%10==0) {
			x/=10;
		}
		int x_reverse=0;
		int pop;
		while(x!=0) {
			pop=x%10;
			x_reverse=x_reverse*10+pop;
			x/=10;
			 if(x_reverse>Integer.MAX_VALUE/10||x_reverse==Integer.MAX_VALUE/10&&pop> 7) return 0;
			 if(x_reverse<Integer.MIN_VALUE/10||x_reverse==Integer.MAX_VALUE/10&&pop<-8) return 0;
		}
		if(x<0) {
			return -x_reverse;
		}else {
			return x_reverse;
		}
	}
}