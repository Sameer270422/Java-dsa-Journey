package Day6;
import java.util.*;
//Palindrome check using  pointers;

public class Palindromee{
	public static void main(String[] args) {
		String s = "madaam";
		boolean pal = true;
		int left =0;
		int right = s.length()-1;
		while(left<right){
			if(s.charAt(left) != s.charAt(right)) {
				pal = false;
			}
			left++;
			right--;
		}
			
		System.out.println(pal);
	}
}