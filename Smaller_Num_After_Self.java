// Q. Given an integer array nums,return an integer array counts where counts[i] is the number of smaller elements to the right of nums[i].

import java.util.Scanner;
public class Smaller_Num_After_Self {

 static int[] counts(int []arr){
  int count[] = new int[arr.length];
  int idx = 0;
  for(int i=0;i<arr.length;i++){
   int temp = arr[i];
   int x = 0;
   for(int j=i+1;j<arr.length;j++)
    if(temp>arr[j])
     x++;
   count[idx] = x;
   idx++;
  }
  return count;
 }
 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  System.out.println("Enter size of array :");
  int size = sc.nextInt();
  int arr[] = new int[size];
  System.out.println("Enter elements of array :");
  for(int i=0;i<size;i++)
   arr[i] = sc.nextInt();
  sc.close(); 
  int ans[] = counts(arr); 
  System.out.println("Answer Array:");
  for(int element : ans){
   System.out.print(element+" ");
  }
 }
}