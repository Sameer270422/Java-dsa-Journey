package Day5;
import java.util.*;
public class LongestSubString1{
	public static void main(String[] args) {
		String s = "eceba";
		int k=2;
		int[] freq = new int[26];
		int left = 0;
		int distinctCount = 0;
		int maxLen = 0;
		for(int right=0; right<s.length();right++) {
			char ch = s.charAt(right);
			if(freq[ch -'a'] == 0) {
				distinctCount++;
			}
			freq[ch-'a']++;
			
			while(distinctCount>k) {
				char leftch = s.charAt(left);
				freq[leftch - 'a']--;
				
				if(freq[leftch - 'a'] == 0) {
					distinctCount--;
				}
				left++;
			}
			maxLen = Math.max(maxLen,right-left+1);
		}	
		System.out.println(maxLen);
		
	}

}
