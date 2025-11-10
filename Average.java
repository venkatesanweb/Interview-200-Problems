import java.util.*;
public class Average{

  public static void main(String [] args){
  
  Scanner sc = new Scanner(System.in);
  int n=sc.nextInt();
  int arr[] =new int[n];
  for(int i=0;i<n;i++) arr[i]=sc.nextInt();
  float sum=0;
  for(int val:arr) sum+=val;
  float avg=sum/arr.length;
  System.out.printf("%.2f",avg);
  }
  
}
