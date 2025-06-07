import java.util.Scanner;

public class Ceiling_Of_Target_Element_Using_Binary_Search {

 static int ceilingNumberIdx(int[] arr,int target){
  int left = 0;
  int right = arr.length - 1;
  int ans = -1;
  while (left<=right) {
   int mid = (right+left)/2;
   if(arr[mid]<target)
    left = mid + 1;
   else{
    ans = mid;
    right = mid - 1;
   }
  }
  return ans;
 }
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter size of the array :");
  int size = sc.nextInt();
  int[] arr = new int[size];
  System.out.println("Enter elements of array:");
  for(int i=0;i<size;i++)
   arr[i] = sc.nextInt();
  System.out.println("Enter target element:"); 
  int target =  sc.nextInt();
  sc.close();
  int ceilingNum = ceilingNumberIdx(arr, target);
  System.out.println("Ceiling number index :"+ceilingNum);
 }
}
