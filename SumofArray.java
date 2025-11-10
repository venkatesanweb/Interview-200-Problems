import java.util.*;
public class SumofArray{

  public static void main(String [] args){
  
  Scanner sc = new Scanner(System.in);
  int n=sc.nextInt();
  int arr[] =new int[n];
  for(int i=0;i<n;i++) arr[i]=sc.nextInt();
  int sum=0;
  for(int val:arr) sum+=val;
  System.out.println(sum);
  }
  
}
