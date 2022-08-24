package code.strings;

public class ReverseSentence {

	public static void main(String[] args) {
		String s1="Think Twice";
		String s2="";
		String a[]=s1.split(" ");
		for(int i=a.length-1;i>=0;i--) {
			s2=s2+a[i]+" ";
			
		}
		String s3="";
		for(int i=s2.length()-1;i>=0;i--) {
			s3=s3+(char)s2.charAt(i);
			
		}
		s3=s3.toLowerCase();
		System.out.println(s3);
	}

}
