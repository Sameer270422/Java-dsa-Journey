package Day4;
import java.util.*;
public class RevString{
	public static void main(String[] args) {
		String s = "sameer";
		String rev = "";
		for(int i=s.length()-1; i>=0;i--) {
			rev = rev + s.charAt(i);
			}
		if(s.equals(rev)) {
			System.out.println("Is Palindrome" + s);	
		}else System.out.println("not Palindrome");
		System.out.println(rev);
		
	}
}