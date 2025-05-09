import java.util.Scanner;

public class Union_Of_Two_Arrays {
 public static void main(String[] args) {
  
  Scanner sc=new Scanner(System.in);

  System.out.println("Enter size of first array:");
  int size1= sc.nextInt();

  int[] arr1= new int[size1];
  System.out.println("Enter elements of first array:");
  for(int i=0;i<size1;i++)
    arr1[i]=sc.nextInt();
  
  System.out.println("Enter size of first array:");
  int size2= sc.nextInt();
  
  int[] arr2= new int[size2];
  System.out.println("Enter elements of first array:");
   for(int i=0;i<size1;i++)
    arr2[i]=sc.nextInt();  
 
  sc.close();   
   
  int[] arr3 = new int[size1+size2];
  
  int idx=0;
  int j;
  for(int i=0;i<size1;i++){
   for(j=0;j<idx;j++){
    if(arr1[i]==arr3[j])
      break;
   }
   if(j==idx){
    arr3[idx]=arr1[i];  
    idx++;
   }
  }

  for(int i=0;i<size2;i++){
   for(j=0;j<idx;j++){
    if(arr2[i]==arr3[j])
    break;
   }
   if(j==idx){
    arr3[j]=arr2[i];
    idx++;
   }
  }

  System.out.println("Union of two array ");
  for(int i=0;i<idx;i++)
    System.out.println(arr3[i]);

 }
}
