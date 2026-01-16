package Day4;
import java.util.*;

public class CharFreq{
	public static void main(String [] args) {
		String s = "sameer";
		int [] freq= new int[26];
		for(int i=0; i<s.length();i++) {
			char ch = s.charAt(i);
			freq[ch-'a']++;
		}
		for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char)(i + 'a') + " -> " + freq[i]);
            }
		}
	}
}