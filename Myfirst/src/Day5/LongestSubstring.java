package Day5;
import java.util.*;

public class LongestSubstring{
	public static void main(String [] args) {
		String s = "abcabcbb";
		int [] freq = new int[26];
		int Left =0;
		int Maxlen =0;
		for(int right=0;right<s.length();right++) {
			char ch = s.charAt(right);
			freq[ch- 'a']++;
			
			while(freq[ch - 'a']>1) {
				char Leftchar = s.charAt(Left);
				freq[Leftchar -'a']--;
				Left++;
			}
			Maxlen = Math.max(Maxlen, right-Left+1);
		}
	       System.out.println(Maxlen);	
	}
}