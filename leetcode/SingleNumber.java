package LeetCode;
import java.util.*;
public class SingleNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int nums[]= {2,2,2,4,5,5,5,5,4,2,1};
		int result=singleNumber(nums);
		System.out.println(result);
	}
	public static int singleNumber(int[] nums) {
		int result=0;
		for(int i=0;i<nums.length;i++) {
			result^=nums[i];
		}
		return result;
		
	}

}
