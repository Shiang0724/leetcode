package LeetCode;
import java.util.*;
public class BinarySearch_704 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]={-1,0,3,5,9,12};
		int target=sc.nextInt();
		int result=search(arr,target);
		System.out.println(result);
	}
	public static int search(int[] nums,int target) {
		//Arrays.sort(nums);
		int left=0;
		int right=nums.length-1;
		while(left<=right) {
			int middle=(left+right)/2;
			if(nums[middle]<target) {
				left=middle+1;
			}else if(nums[middle]>target) {
				right=middle-1;
			}else {
				return middle;
			}
		}
		return -1;
	}
}
