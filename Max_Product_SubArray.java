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

  int[] maxSubArr = new int[size];
  int idx = 0;
  int start=0;
  int end=0; 

  int max = arr[0];
  for(int i=0;i<size;i++){
   int mult=1;
   for(int j=i+1;j<size;j++){
    mult*=arr[j];
    if(mult>max){
     start = i+1;
     end = j+1;
     max=mult;
    }
   }
  }

  for(int i=start;i<end;i++){
   maxSubArr[idx]=arr[i];
   idx++;
  }

  System.out.println("max = "+max);
  System.out.print("Max Product Sub-Array:\n[ ");
  for(int i=0;i<idx;i++)
   System.out.print(maxSubArr[i]+" ");
  System.out.print("]"); 
  
 }
}
