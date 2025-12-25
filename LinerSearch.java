import java.util.*;
public class LinerSearch{

	public static void main(String [] args){
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int ele=sc.nextInt();
		System.out.println(linearSearch(arr,ele));
		System.out.println(BinearySearch(arr,ele));
		
	
	}
	private static int linearSearch(int []arr,int ele){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==ele){
				return i;
			}
		}
		return -1;
	}
	
	
	
}
