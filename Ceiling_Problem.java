import java.util.Scanner;

public class Ceiling_Problem {
 public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter size of the array:");
  int size = sc.nextInt();

  int[] arr = new int[size];
  System.out.println("Enter elements of the array:");
  for(int i=0;i<size;i++)
   arr[i] = sc.nextInt();

  System.out.println("Enter target element:"); 
  int target = sc.nextInt();

  sc.close();

  boolean flag = false;
  int ans = 0;
  for(int i=0;i<size-1;i++){
   if(i==0 && arr[i]>=target){
    ans = i;
     flag = true;
     break;
   }
   if(target==arr[i]){
     ans = i;
     flag = true;
     break;
   }
   else if(target < arr[i+1] && target > arr[i]){
     ans = i+1;
     flag = true;
     break;
   }
  }
  if(flag)
   System.out.println("Index of ceiling :"+ans);
  else
   System.out.println("Ceiling is not present!"); 
 }
}
