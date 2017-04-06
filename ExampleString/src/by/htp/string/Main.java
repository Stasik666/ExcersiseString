package by.htp.string;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);	
		
		String text = scanner.nextLine();
		char x = '!';
		int k = 5;
		
		char[] newChar =text.toCharArray() ;
		for(int i = k-1;i<text.length();i+=k){
			newChar[i] = x;
		}
		System.out.print(newChar);
		
		
		String text2 = scanner.nextLine();
		String a = "";
		
		a = text2.substring(0,text2.indexOf('(')) + text2.substring(text2.indexOf(')')+1,text2.length());
		
		System.out.println(a);
		
	}
}
