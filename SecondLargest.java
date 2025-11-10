import java.util.*;
public class SecondLargest{

public static void main(String[] args){

  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int arr[]=new int[n];
  for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
  }
  int max=arr[0];
  int secondMax=arr[0];
  int min=arr[0];
  int secondmin=arr[0];
  for(int i=0;i<n;i++){
  if(arr[i]>max){
  secondMax=max;
  max=arr[i];
  }
  else if(arr[i]>secondMax && secondMax!=max){
    secondMax=arr[i];
  }
  if(arr[i]<min){
  secondmin=min;
  min=arr[i];
  }
  else if(arr[i]<secondmin && secondmin!=min){
  secondmin=min;
  }
  }
  System.out.println(secondMax);
  System.out.println(secondmin);
}

}
