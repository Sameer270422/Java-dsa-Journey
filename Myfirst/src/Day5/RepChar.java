package Day5;
import java.util.*;
public class RepChar{
	public static void main(String[] args) {
		String s = "aabccbb";
		int left =0;
		int maxlen=0;
		int repeatcount=0;
		int [] freq = new int[26];
		for(int right=0;right<s.length();right++) {
			char ch = s.charAt(right);
			freq[ch - 'a']++;
			if(freq[ch-'a']==2) {
				repeatcount++;
			}
			while(repeatcount>1) {
				char leftch = s.charAt(left);
				freq[ch-'a']--;
				
				if(freq[ch-'a']==1) {
					repeatcount--;
				}
				left++;
				
			}
			maxlen = Math.max(repeatcount, right-left+1);
		}
		System.out.print(maxlen);
	}
}