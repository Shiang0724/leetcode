package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {

	public static void main(String[] args) {
		int nums[]=new int[] {1,2,3,4,5};
		String arrayAsString=Arrays.toString(twoSum(nums,5)); //使用Arrays.toString來轉換
		System.out.println(arrayAsString);
		
	}
	//Map寫法
	public static int[] twoSum(int[] nums,int target) {
		Map<Integer,Integer> num_map=new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			int complement=target-nums[i];
			if(num_map.containsKey(complement)) {
				return new int[] {num_map.get(complement),i};
			}
			num_map.put(nums[i], i);
		}
		throw new IllegalArgumentException("no match found");
	}
//	public static int[] twoSum(int[] nums,int target) {
//		for(int i=0;i<nums.length;i++) {
//			for(int j=i+1;j<nums.length;j++) { //j=i+1避免重複
//				int sum=nums[i]+nums[j];
//				if(sum==target) {
//					return new int[] {i,j};
//				}
//			}
//		}
//		throw new IllegalArgumentException("no match found");
//	}

}
