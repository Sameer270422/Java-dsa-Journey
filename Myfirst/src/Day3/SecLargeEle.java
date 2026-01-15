package Day3;
import java.util.*;
public class SecLargeEle{
	public static void main(String[] args) {
		int[] arr= {10,20,20,45};
		int max = Integer.MIN_VALUE;
		int secmax = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secmax=max;
				max=arr[i];
			}else if(arr[i]<max && arr[i]>secmax) {
				secmax=arr[i];
			}
			}
		System.out.println(max);
		System.out.println(secmax);
		
		
	}
}
//O(N)