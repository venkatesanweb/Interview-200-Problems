import java.util.*;
public class RemoveDupli{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		Set<Integer> set=new HashSet<>();
		for(int val:arr){
			if(!set.contains(val)){
				set.add(val);
			}
		}
		System.out.println(set);
	}

}
