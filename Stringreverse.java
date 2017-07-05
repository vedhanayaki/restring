package guviset3;
import java.util.Scanner;
public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s="department";
String c;
	StringBuffer a=new StringBuffer(s).reverse();
	System.out.println(""+a);
	String b=a.toString();
    System.out.print("Removing Vowels from The String [" +b+ "]\n");
    c = b.replaceAll("[aeiouAEIOU]", "");
	}

}
