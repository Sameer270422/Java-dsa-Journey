package Day5;
import java.util.*;
public class LongestSubarraySum{
	public static void main(String[] args) {
		int[] arr = {2, 1, 5, 1, 3, 2};
        int K = 7;
        int sum=0;
        int left =0;
        int maxlen=0;
        
        for(int right=0;right<arr.length;right++) {
        	sum += arr[right];// expand window
        	while(sum>K) {
        		sum = sum - arr[left];//Shrikimng from left if invalid
        		left++;
        	}
        	maxlen = Math.max(maxlen, right-left +1);
        }
        System.out.println(maxlen);
	}
}