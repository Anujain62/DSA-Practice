import java.util.Scanner;
public class First_Last_Index_Of_Target_Using_Binary_Search {
 static int[] firstLastIdx(int[] arr,int target){
  int[] ansArr = new int[2];
  int start = 0;
  int end = arr.length - 1;
   while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target && (mid==0 || arr[mid-1]<target)) {
                ansArr[0] = mid;
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        start = 0;
        end = arr.length - 1;
  while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target && (mid==arr.length-1 || arr[mid+1]>target)) {
                ansArr[1] = mid;
                break; 
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
       return ansArr;
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
  int[] ansArr = firstLastIdx(arr, target);
        System.out.println("First Occurrence: " + ansArr[0]);
        System.out.println("Last Occurrence: " + ansArr[1]);
 }
}
