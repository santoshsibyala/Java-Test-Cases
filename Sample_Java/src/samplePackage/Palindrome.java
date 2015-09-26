package samplePackage;

public class Palindrome {

	
public static String reverse(String s){
	
	try{
		StringBuffer palin=new StringBuffer(s);
		StringBuffer reverse=palin.reverse();
		String a=reverse.toString();
		return a;
	}catch(NullPointerException e){
		return null;
	}
}



}
