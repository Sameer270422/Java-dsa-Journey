package Day5;
import java.util.*;

public class MaxSumSubarray{
	public static void main(String[] args) {
		int[] arr = {-1,-5,-1,-2,-3,-4,-5};
		int k =3;
		int Maxsum = 0;
		
		//Window 1
		for(int i =0; i<k; i++) {
			Maxsum = Maxsum+ arr[i];
			
		}
		int sum = Maxsum;
		//Sliding window 
		for(int i =k; i<arr.length;i++) {
			sum = sum + arr[i] - arr[i-k];
			Maxsum = Math.min(Maxsum,sum);
			
		}
		System.out.print(Maxsum);
	}
}

