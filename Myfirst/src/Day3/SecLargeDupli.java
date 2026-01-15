package Day3;
import java.util.*;
public class SecLargeDupli{
	public static void main(String[] args) {
		int[] arr = {30000, 50000, 40000, 50000};;
		int max = Integer.MIN_VALUE;
		int secmax = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secmax = max;
				max=arr[i];
				}else if(arr[i]>secmax && arr[i]<max) {
					secmax= arr[i];
				}
		}
		System.out.print(secmax);
	}
}