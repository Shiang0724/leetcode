package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

//easy
public class ContainsDuplicate_217 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] nums=new int[n];
		for(int i=0;i<nums.length;i++) {
			nums[i]=sc.nextInt();
		}
		System.out.println(containsDuplicate(nums));
	}
	public static boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);					//���N�}�C�i��Ƨ�
//		for(int i=0;i<nums.length;i++) {
//			System.out.print(nums[i]+" ");
//		}
		for(int i=0;i<nums.length;i++) {
			if(i==nums.length-1) {			//i��̫�@�Ӱ�� �_�h�}�C�|�z��
				break;
			}
			if(nums[i]==nums[i+1]) {
				return true;
			}
		}
		return false;
	}
}
