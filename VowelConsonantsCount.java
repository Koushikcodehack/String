package code.strings;

public class VowelConsonantsCount {
	public static void main(String[] args) {
		int vowel=0;
		int consonant=0;
		String s="The way to coding";
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			 if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				 vowel++;
			 }
			 else if(s.charAt(i)>='a'&&s.charAt(i)<='z') {
				 consonant++;
			 }
		}
		System.out.println("Number of vowels:"+vowel);
		System.out.println("Number of consonants:"+consonant);
	}
}
