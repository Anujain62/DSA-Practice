// Given a fixed length integer arr, duplicate each occurrence of zero, 
// shifting the remaining elements to the right.
// Example -   Input: arr = [1,0,2,3,0,4,5,0]   ,  Output: [1,0,0,2,3,0,0,4]



import java.util.Arrays;
import java.util.Scanner;

public class Duplicate_Zeros {
 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  System.out.println("Enter size of array:");
  int size = sc.nextInt();

  int[] arr = new int[size];

  System.out.println("Enter elements of array:");
  for(int i=0;i<size;i++)
   arr[i]=sc.nextInt();

  sc.close();

  System.out.println("Original array :"+Arrays.toString(arr));

  int idx=0;
  while (idx<size) {

   if(arr[idx]==0){
    for(int i=size-1;i>idx;i--)
     arr[i]=arr[i-1];
    arr[idx+1]=0;
    idx+=2; 
   }
   else
    idx++;
    
  }

  System.out.println("New array :"+Arrays.toString(arr));

 }
}
