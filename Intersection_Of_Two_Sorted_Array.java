import java.util.Scanner;

public class Intersection_Of_Two_Sorted_Array {
 public static void main(String[] args) {
  
  Scanner sc= new Scanner(System.in);

  System.out.println("Enter size of first array:");
  int size1 = sc.nextInt();

  int[] arr1 = new int[size1];
  System.out.println("Enter elements of first array:");
  for(int i=0;i<size1;i++)
   arr1[i]=sc.nextInt();
  
  System.out.println("Enter size of second array:");  
  int size2= sc.nextInt();

  int[] arr2 = new int[size2];
  System.out.println("Enter elements of second array:");
  for(int i=0;i<size2;i++)
   arr2[i]=sc.nextInt();

  sc.close();
  
  int size3 = size1>size2?size2:size1;

  int[] arr3 = new int[size3];
  int idx=0;

  int i=0;
  while (i<size1) {
   for(int j=0;j<size2;j++){
    if(arr1[i]==arr2[j]){
     arr3[idx]=arr1[i];
     idx++;
     break;
    }
   }
   i++;
  }

  System.out.print("Intersection of two sorted array is \n[ ");
  for(i=0;i<idx;i++)
   System.out.print(arr3[i]+" ");
  System.out.print("]"); 


 }
}
