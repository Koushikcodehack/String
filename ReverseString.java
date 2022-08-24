package code.strings;

public class ReverseString {

	public static void main(String[] args) {
		String s1="iNeuron";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+(char)(s1.charAt(i));
		}
		System.out.println(s2);
	}

}
