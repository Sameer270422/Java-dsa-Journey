package Day6;
import java.util.*;
/// Reversing array using pointers
public class Pointersrev{
	public static void main(String[] args) {
		int [] arr = {11,12,13,14};
		int left =0;
		int right = arr.length-1;
		int temp=0;
		while(left<right) {
			temp=arr[left];
			arr[left]=arr[right];
			arr[right] = temp;
			left++;
			right--;
			
		}
		for (int i = 0; i < arr.length; i++) {
		    System.out.print(arr[i] + " ");
		}
		
	}
	
}