package Day6;
import java.util.*;

//moving zeros to last aand keeping other numbers sorted
public class MoveZero{
	public static void main(String[] args) {
		int[] arr = {0,1,3,12,0,0};
		int left =0;
		for(int right =0; right<arr.length;right++) {
			if(arr[right] != 0) {
				arr[left]=arr[right];
				left++;
			}
		}
		while(left<arr.length) {
			arr[left]=0;
			left++;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}