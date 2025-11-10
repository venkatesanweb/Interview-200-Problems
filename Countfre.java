import java.util.*;
public class Countfre{

  public static void main(String [] args){
  
  Scanner sc = new Scanner(System.in);
  int n=sc.nextInt();
  int arr[] =new int[n];
  Map<Integer,Integer> map=new HashMap<>();
  for(int i=0;i<n;i++) arr[i]=sc.nextInt();
  for(int val:arr){
    map.put(val,map.getOrDefault(val,0)+1);
  }
  System.out.println(map);
  }
  
}
