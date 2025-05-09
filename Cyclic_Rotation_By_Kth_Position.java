import java.util.Scanner;

public class Cyclic_Rotation_By_Kth_Position {
 public static void main(String[] args) {
  
  Scanner sc=new Scanner(System.in);

  System.out.println("Enter size of array:");
  int size = sc.nextInt();

  int[] arr = new int[size];
  System.out.println("Enter elements of array:");
  for(int i=0;i<size;i++){
   arr[i]=sc.nextInt();
  }

  System.out.println("Enter position for rotation:");
  int position = sc.nextInt();

  int x=position;

  sc.close();
  
  System.out.println("Original array:");
  for(int e: arr)
   System.out.print(e+" ");

  while (position>0) {
   int temp=arr[size-1];
   for(int i=size-1;i>0;i--){
    arr[i]=arr[i-1];
   }
   arr[0]=temp;
   position--;
  }

  System.out.println("\nAfter "+x+"th rotation Araay :");
  for(int e: arr)
   System.out.print(e+" ");
  


 }
}
