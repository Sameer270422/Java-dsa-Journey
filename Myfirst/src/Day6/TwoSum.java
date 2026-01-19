package Day6;
import java.util.*;
public class TwoSum{
	public static void main(String [] args) {
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		int left =0;
		int right = nums.length-1;
		boolean b= false;
		
		while(left< right) {
			if(nums[left]+nums[right] == target) {
				b= true;
				break;
			}else if (nums[left]+nums[right] >target) {
				right--;
			}else if (nums[left]+nums[right] <target) {
				left++;
			}
		}
		if(b ==true) {
			System.out.print(left+ " " +right);
		}
	}
}