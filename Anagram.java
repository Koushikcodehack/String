package code.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String s1=sc.nextLine();
		System.out.println("Enter the second string: ");
		String s2=sc.nextLine();
		if(s1.length()==s2.length()) {
			char []c1=s1.toCharArray();
			char []c2=s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			boolean a=Arrays.equals(c1, c2);
			if(a) {
				System.out.println(s1+" "+s2+" is an Anagram");
			}
			else {
				System.out.println(s1+" "+s2+" is not an Anagram");
			}
		}
		else {
			System.out.println(s1+" "+s2+" is not an Anagram");
		}
	}

}
