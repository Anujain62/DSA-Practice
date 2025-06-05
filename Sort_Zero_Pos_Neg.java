import java.util.Scanner;

public class Sort_Zero_Pos_Neg {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter size of array:");
  int size = sc.nextInt();

  System.out.println("Enter elements of array:");
  int[] arr = new int[size];
  for(int i=0;i<size;i++)
    arr[i] = sc.nextInt();

  sc.close();  

  System.out.println("Original array:");
  for(int i=0;i<size;i++)
   System.out.print(arr[i]+" ");

  int idx = 0;
  while (idx<size) {

   for(int i=0;i<size;i++){
    if(arr[i]==0){
     int temp = arr[i];
     arr[i] = arr[idx];
     arr[idx] = temp;
     idx++;
    }
   }
   for(int i=0;i<size;i++){
    if(arr[i]<0){
     int temp = arr[i];
     arr[i] = arr[idx];
     arr[idx] = temp;
     idx++;
    }
   }
   for(int i=0;i<size;i++){
    if(arr[i]>0){
     int temp = arr[i];
     arr[i] = arr[idx];
     arr[idx] = temp;
     idx++;
    }
   }

  } 
  System.out.println("\nNew array:"); 
  for(int i=0;i<size;i++)
   System.out.print(arr[i]+" ");
 }
}
