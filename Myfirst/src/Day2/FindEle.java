package Day2;
import java.util.*;
public class FindEle{
	public static void main(String[] args) {
		int[] arr = {1,23,4,5};
		int target=23;
		boolean found = false;
		for (int i=0; i<arr.length;i++) {
			if(arr[i]== target) {
				System.out.println("Found"+ arr[i]);
				found = true;
				break;
			}
			
		}if(!found) System.out.println("found");
	}
}