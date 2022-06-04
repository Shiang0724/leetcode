package LeetCode;
import java.util.*;
public class Sqrt_69 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long x=sc.nextInt();
		long result=mySqrt(x);
		System.out.println(result);
	}
	public static int mySqrt(long x) {
		long left=0;
		long right=x;
		while(left<=right) {
			long middle=left+(right-left)/2;
			long sqrt=middle*middle;
			if(sqrt>x) {
				right=middle-1;
			}else if(sqrt<x) {
				left=middle+1;
			}else {
				return (int)middle;
			}
		}
		return (int)left-1;
	}
}
