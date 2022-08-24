package code.strings;

public class SpecialCharacterCount {
	public static void main(String[] args) {
		String s="K!o@u#s$h%i^k";
		int alpha=0;
		int number=0;
		int special=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='A'&&s.charAt(i)<='Z') {
				alpha++;
			}
			else if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
				number++;
			}
			else {
				special++;
			}
		}
		System.out.println("Number of special characters:"+special);
	}
}
