package LeetCode;
import java.util.*;
public class FindFirstandLastPosition_34 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] nums= {1};
		int target=0;
		boolean in=true;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=target) {
				in=false;
			}else {
				in=true;
				break;
			}
		}
		
		if(in==false) {
			System.out.println("-1 -1");
		}
	}
	
}
