package Myfirst;
import java.util.*;

public class Revs{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		System.out.println(a);	
		String b = "";
		for(int i=a.length()-1; i>=0;i--) {
			b= b+ a.charAt(i);
		}
		System.out.println(b);
		String sb =  new StringBuilder(a).reverse().toString();
		System.out.println(sb);
	}
}