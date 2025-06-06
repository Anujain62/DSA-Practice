import java.util.Scanner;

public class Find_How_Many_Even_Digit_Num_In_Array {

 public static int[] totalCount(int[] array){
  int total = 0;
  int[] tempArr = new int[array.length];
  int idx = 0;
  for(int i=0;i<array.length;i++){
   int count = 0;
   int temp = array[i];
   while (temp>0) {
    count++;
    temp/=10;
   }
   if(count%2==0){
    total++;
    tempArr[idx] = i;
    idx++;
   }
  }
  System.out.println("Number of even digit numbers an array :"+total);
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

  sc.close();
  
  int[] tempArr = totalCount(arr); 
  System.out.println("Index of even digit numbers:");
  int count = 1;
  for(int i=0;i<tempArr.length;i++){
   if(tempArr[i]==0 && count<0) 
    break;
   else{
     System.out.println(tempArr[i]);
     count--;
   }
  }
 }
}
