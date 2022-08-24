package code.strings;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s=sc.nextLine();
		char []c=s.toCharArray();
		Arrays.sort(c);
		System.out.println(new String(c));
	}
}
