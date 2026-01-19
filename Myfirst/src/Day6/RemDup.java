package Day6;
import java.util.*;

public class RemDup{
	public static void main(String [] args) {
		int[] arr= {1,1,2,2,3};
		int left =1;//position for ext unique element
		for(int right =1;right<arr.length;right++) {
			if(arr[right] != arr[ right-1]) {
				arr[left] = arr[right];
				left++;
				
			}
		}
		System.out.println(left);
		
		
	}
}