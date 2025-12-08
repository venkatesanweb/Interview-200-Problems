import java.util.*;

public class Palin{

	public static void main(String [] args){
	
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String rev="";
		for(int i=s.length()-1;i>=0;i--){
			rev+=s.charAt(i);
		}
		if(rev==s){
			System.out.println("Palindrom");
		}
		else{
			System.out.println("Not a Palindrom");
		}
	}

}
