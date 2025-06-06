import java.util.Scanner;

public class Find_First_Last_Index_Of_Target {

 static int[] findIndex(int[] arr,int target){
  int[] tempArr = {-1,-1};
  boolean flag = true;
  for(int i=0;i<arr.length;i++){
   if(arr[i]==target && flag){
    tempArr[0] = i;
    flag = false;
   }
   if(arr[i]==target)
    tempArr[1] = i;  
  }
  return tempArr;
 }
 public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter size of array:");
  int size = sc.nextInt();
  System.out.println("Enter elements of array :");
  int[] arr = new int[size];
  for(int i=0;i<size;i++)
   arr[i] = sc.nextInt();
  System.out.println("Enter target element:"); 
  int target = sc.nextInt();
  sc.close();
  int[] ans = findIndex(arr, target);
  System.out.println("First and Last index : [ "+ans[0]+","+ans[1]+" ]");
 }
}
