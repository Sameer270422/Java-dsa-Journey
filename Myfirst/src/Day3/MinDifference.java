package Day3;
import java.util.*;
public class MinDifference{
	public static void main(String [] args) {
		int[] arr = {5, 3, 8, 1};
		int mindiff= Integer.MAX_VALUE;
		int abs= 0;
		for(int i=0;i<arr.length;i++) {
			{
				for(int j=i+1;j<arr.length;j++) {
					abs= Math.abs(arr[i]-arr[j]);
					if(abs<mindiff) {
						mindiff=abs;
					}
					
				}
			}
		}
		System.out.print(mindiff);
	}
}

//O(N^2)