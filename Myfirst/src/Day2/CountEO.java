package Day2;
import java.util.*;
public class CountEO{
	public static void main(String[] args) {
		int[] arr= {2,4,6,7,9};
		int cO=0;
		int CE=0;
		for (int i=0;i<arr.length;i++) {
			if(arr[i]%2 == 0) cO = cO+1;
			else CE = CE+1;
		}
		System.out.println(cO);
		System.out.println(CE);
	}
}