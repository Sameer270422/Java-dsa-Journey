package Day5;
import java.util.*;

public class MaxAverageSubarray{
	public static void main(String [] args) {
		int arr[] = {1, 12, -5, -6, 50, 3};
		int k = 4;
		
		int sum = 0;
		for(int i=0;i<k;i++) {
			sum += arr[i];
		}
		int Maxsum = sum;
		for(int i=k;i<arr.length;i++) {
			sum=sum+arr[i]-arr[i-k];
			Maxsum = Math.max(Maxsum, sum);
		}
		double MaxAve = (double)Maxsum/k;
		System.out.println(MaxAve);
		
	}
}