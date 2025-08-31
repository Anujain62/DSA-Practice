import java.util.Arrays;
import java.util.Scanner;

public class Unique_Number {
 static int[] uniqueNum(int[] arr){
  int[] ans = {0,0};
  int idx = 0,j;
  for(int i=0;i<arr.length;i++){
   for(j=0;j<arr.length;j++)
    if(arr[i]==arr[j] && i!=j)
     break;
   if(j==arr.length){
    ans[idx] = arr[i];
    idx++;
   }
  }
  return ans;
 }

 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  System.out.println("Enter size of array:");
  int size = sc.nextInt();
  int[] arr = new int[size];
  System.out.println("Enter elements of array :");
  for(int i=0;i<size;i++)
   arr[i] = sc.nextInt();
  sc.close(); 
  int[] ans = uniqueNum(arr);
  Arrays.sort(ans);
  System.out.println("Unique Numbers :");
  for (int i : ans)
   System.out.print(i+" ");
 }
}
