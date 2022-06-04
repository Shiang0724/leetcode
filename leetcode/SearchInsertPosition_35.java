package LeetCode;
import java.util.*;
public class SearchInsertPosition_35 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int nums[]= {1,3,5,6};
		int target=sc.nextInt();
		int result=searchInsert(nums,target);
		System.out.println(result);
	}
	public static int searchInsert(int[] nums,int target) {
		int left=0;
		int right=nums.length-1;
		while(left<=right) {
			int middle=left+(right-left)/2;
			if(target>nums[middle]) {
				left=middle+1;
			}else if(target<nums[middle]) {
				right=middle-1;
			}else {
				return middle;
			}
		}
		return left;
	}

}
