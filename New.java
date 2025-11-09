import java.util.*;

public class New{
	
	public static void main(String[] args){
		
		Scanner s1 = new Scanner(System.in);
		
		int n = s1.nextInt();
		int [] arr = new int [n];
		
		List<Integer> list = new ArrayList<>();
		int count =0;
		while(true){
		
			list.add(s1.nextInt());
			count++;
			if(n == count)break;
		
		}
		System.out.println(list);
		
		
	
	}


}
