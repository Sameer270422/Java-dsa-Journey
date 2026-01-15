package Day3;
import java.util.*;
public class SecSmall{
	public static void main(String[] args) {
		int[] arr= {9,10};
		int min = Integer.MAX_VALUE;//I initialize min and second min to the largest possible value so any real number can replace them safely
		int secmin = Integer.MAX_VALUE;
		if(arr.length<2) {
			System.out.println("no sec large");
			return;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				secmin = min;
				min = arr[i];
			}else if(arr[i]>min && arr[i]<secmin) {
				secmin = arr[i];
			}
		}
		System.out.print(secmin);
		
	}
}