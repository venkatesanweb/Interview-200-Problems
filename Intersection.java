import java.util.*;
import java.lang.*;
public class Intersection{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr1[]=new int[n];
		int n1=sc.nextInt();
		int arr2[]=new int[n];
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<n;i++){
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<n1;i++){
			arr2[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
		for(int j=0;j<n1;j++){
			if(arr1[i]==arr2[j]){
			list.add(arr1[i]);
			break;
		}	}	}
		System.out.println(list);
		
		
	}

}
