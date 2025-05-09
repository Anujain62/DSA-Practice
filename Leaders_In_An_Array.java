// Find all the leaders in the array. An element is a leader if it is greater than or equal
// to all the elements to its right side.

import java.util.Scanner;

public class Leaders_In_An_Array {
 public static void main(String[] args) {
  
  Scanner sc=new Scanner(System.in);

  System.out.println("Enter size of array:");
  int size=sc.nextInt();

  int[] arr = new int[size];
  System.out.println("Enter elements of array:");
  for(int i=0;i<size;i++)
   arr[i]=sc.nextInt();

  sc.close();  

  int i,j,idx=0;
  int[] leader=new int[size];
  for(i=0;i<size-1;i++){
   for(j=i+1;j<size;j++){
    if(arr[i]<arr[j])
      break;
   }
   if(j==size){
    leader[idx]=arr[i];
    idx++;
   }
  }
  leader[idx]=arr[size-1];

  System.out.print("Leaders of this array is : [ ");
  for(i=0;i<=idx;i++)
   System.out.print(leader[i]+" ");
  System.out.println("]"); 

 }
}
