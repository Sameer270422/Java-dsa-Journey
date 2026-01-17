package Day5;
import java.util.*;

public class CountSubarrays{
	public static void main(String [] args) {
		int[] arr = {2, 1, 5, 1, 3, 2};
		int k = 3;
		int x = 7;
		int sum = 0;
		int c  = 0;
		for(int i=0; i<3;i++) {
			sum= sum + arr[i];
		}
		if(sum>x) {
			c = c + 1;
		}
		int sum1 = sum;
		for(int i=3;i<arr.length;i++) {
			sum1 = sum1 + arr[i] - arr[i-k];
			if(sum1>x) {
				c = c + 1;
			}
		}
		System.out.println(c);

	}
}