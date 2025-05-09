import java.util.Scanner;

public class Check_Array_Sorted_And_Rotated {
 public static void main(String[] args) {
  
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter size of array:");
  int size=sc.nextInt();
  int[] arr = new int[size];
  System.out.println("Enter elements of array:");
  for(int i=0;i<size;i++)
   arr[i]=sc.nextInt();
  sc.close();  
  int count=0;
  int i;
  for(i=0;i<size-1;i++){
   if(arr[i]>arr[i+1]){
    count++;
    break;
   }
  }
  int j;
  for(j=i+1;j<size-1;j++){
   if(arr[j]<arr[j+1])
     count++;
   else
     break;  
  }
  if(j==size-1){
   System.out.print("Given array [ ");
   for(j=0;j<size;j++)
   System.out.print(arr[j]+" ");
   System.out.println("] is sorted and rotated by "+count+" positions"); 
  }
  else{
   System.out.println("Array is not sorted!");
  }
 }
}
