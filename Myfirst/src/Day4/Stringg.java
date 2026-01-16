package Day4;
import java.util.*;
public class Stringg{
	public static void main(String[] args) {
		String s = "sameer";
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));
		}
	}
}