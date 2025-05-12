import java.util.Scanner;

public class Max_Product_SubArray {
 public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter size of array:");
  int size = sc.nextInt();

  int[] arr = new int[size];
  System.out.println("Enter elements of array:");
  for(int i=0;i<size;i++)
   arr[i] = sc.nextInt();

  sc.close(); 

  int start=0;
  int end=0; 

  int max=0;
  for(int i=0;i<size;i++){
   int temp=arr[i];
   int mult=1;
   for(int j=i;j<size;j++){
    mult*=arr[j];
    if(mult>=temp && mult>max){
     start=i;
     end=j;
     temp=mult;
    }
   }
   if(max<temp)
    max=temp;
  }

  System.out.println("Maximum product = "+max);
  System.out.print("Max Product Sub-Array:\n[ ");
  for(int i=start;i<=end;i++)
   System.out.print(arr[i]+" ");
  System.out.print("]"); 
  
 }
}
