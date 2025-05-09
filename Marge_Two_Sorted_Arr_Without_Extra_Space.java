import java.util.Scanner;

public class Marge_Two_Sorted_Arr_Without_Extra_Space {
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

  int left = size1-1;
  int right = 0;

  while (left>=0 && right<size2) {
   if(arr1[left]>=arr2[right]){
    int temp=arr1[left];
    arr1[left]=arr2[right];
    arr2[right]=temp;
    right++;
    left--;
   }
   else
    break;
  }

  for(int i=0;i<size1-1;i++){
   for(int j=i+1;j<size1;j++){
    if(arr1[i]>arr1[j]){
     int temp=arr1[i];
     arr1[i]=arr1[j];
     arr1[j]=temp;
    }
   }
  }

  for(int i=0;i<size2-1;i++){
   for(int j=i+1;j<size2;j++){
    if(arr2[i]>arr2[j]){
     int temp=arr2[i];
     arr2[i]=arr2[j];
     arr2[j]=temp;
    }
   }
  }


  System.out.println("After marging both arrays :");
  System.out.print("1. [");
  for(int i=0;i<size1;i++)
   System.out.print(arr1[i]+" ");
  System.out.print("]\n2. [ "); 
  for(int i=0;i<size2;i++)
   System.out.print(arr2[i]+" ");
  System.out.print("]"); 
 }
}
