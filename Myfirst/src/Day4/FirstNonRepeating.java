package Day4;
import java.util.*;

public class FirstNonRepeating{
	public static void main(String[] args) {
		String s = "bbsmeer";
		int[] freq = new int[26];
		for(int i=0; i<s.length();i++){
			char ch = s.charAt(i);
			freq[ch - 'a']++;
		}
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(freq[ch-'a']==1) {
				System.out.println("first non repeating chracter" + " " +ch);
				break;
			
			}
		}
	}
}

