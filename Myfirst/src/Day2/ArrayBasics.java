package Day2;
import java.util.*;

public class ArrayBasics{
	public static void main(String[] args) {
		int[] arr = {10,50,30,12};
		int max = arr[0];
		int min = arr[0];
		int sum =0;
		for(int i=0; i<=arr.length-1;i++) {
			sum = sum+arr[i];
			if(arr[i]>max) {
				max= arr[i];
			}if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
	}
}