package Myfirst;

import java.util.*;
public class Hello {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("tell you age:");
        int age = sc.nextInt();
        System.out.print(age);
        System.out.print("tell you name:");
        String name = sc.next();
        System.out.print("you name:" + name);
        
        if(age>=18) {
        	System.out.print(name+":you are allowed vote" );
        }else {
        	System.out.print(name+":you are not" );
        }
        
        
        		}
}
