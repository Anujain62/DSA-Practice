import java.util.Scanner;

public class Floor_Of_Target_Element_Using_Binary_Search {

 static int floorNumberIdx(int[] arr,int target){
  int left =0;
  int right = arr.length - 1;
  int ans = -1;
  while (left<=right) {
   int mid = left + (right - left)/2;
   if(arr[mid]>target)
    right = mid -1;
   else{
    ans = mid;
    left = mid + 1 ;
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
  int floorNumber = floorNumberIdx(arr, target);
  System.out.println(floorNumber);
 }
}
