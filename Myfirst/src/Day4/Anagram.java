package Day4;
import java.util.*;

public class Anagram{
	public static void main(String[] args) {
		String s = "sameera";
		String b = "reemasa";
		int[] freq = new int[26];
		if(s.length() != b.length()) {
			System.out.println("not Anagram");
			return;
		}
		for(int i=0; i<s.length();i++) {
			char ch = s.charAt(i);
			freq[ch -'a']++;
		}
		for(int i=0; i<b.length();i++) {
			char ch = b.charAt(i);
			freq[ch -'a']--;
		}
		for(int i=0;i<26; i++) {
			if(freq[i] != 0) {
				System.out.println("not Anagram");
				return;
			}
		}
		System.out.println("Anagram");
		
	}
}