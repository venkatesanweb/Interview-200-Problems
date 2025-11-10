import java.util.*;
public class Magerity{

  public static void main(String [] args){
  
  Scanner sc = new Scanner(System.in);
  int n=sc.nextInt();
  int arr[] =new int[n];
  Map<Integer,Integer> map=new HashMap<>();
  for(int i=0;i<n;i++) arr[i]=sc.nextInt();
  
  for(int val:arr){
    map.put(val,map.  (val,0)+1);
  }
  for(int val:map.keySet()){
    int value=map.get(val);
    if(value>n/2){
    System.out.println("Mg: "+value);
    }
  }
 
  
  }
  
}
