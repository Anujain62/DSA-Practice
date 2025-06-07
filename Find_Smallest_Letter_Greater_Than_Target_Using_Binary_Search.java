import java.util.Scanner;

public class Find_Smallest_Letter_Greater_Than_Target_Using_Binary_Search {

 static int smallLetter(char[] arr,char target){
  int left = 0;
  int right  = arr.length - 1;
  int idx = -1;
  while (left<=right) {
   int mid = left + (right-left)/2;
   if(arr[mid]<target)
    left = mid+1;
   else{
    idx = mid ;
    right = mid - 1;
   }
  }
  return idx;
 }
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter size of the array :");
  int size = sc.nextInt();
  char[] arr = new char[size];
  System.out.println("Enter elements of array:");
  for(int i=0;i<size;i++)
   arr[i] = sc.next().charAt(0);
  System.out.println("Enter target element:"); 
  char target =  sc.next().charAt(0);
  sc.close();
  int smallLetr = smallLetter(arr,target);
  if(smallLetr<0)
    System.out.println("Small Letter Greater than target : "+arr[0 ]);
  else
    System.out.println("Small Letter Greater than target :"+arr[smallLetr]);
 }
}
