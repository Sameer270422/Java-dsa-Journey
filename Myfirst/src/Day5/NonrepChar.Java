//length of the longest substring that has no repeated characters.
package Day5;
import java.util.*;

public class NonrepChar{
	public static void main(String []args) {
		String s = "abcabcbb";
		int Left = 0;
		int Maxlen =0;
		int [] freq= new int[26];
		for(int right = 0; right<s.length();right++) {
			char ch = s.charAt(right);
			freq[ch-'a']++; //incrementing the character count
			
			while(freq[ch-'a']>1) {
				char leftch= s.charAt(Left);
				freq[leftch-'a']--;
				Left++; // incrementing left pointer
				
			}
			
			Maxlen = Math.max(Maxlen, right-Left+1);
		}
		System.out.println(Maxlen);
	}
}
