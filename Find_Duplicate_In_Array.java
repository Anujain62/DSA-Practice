import java.util.Scanner;

public class Find_Duplicate_In_Array {
 public static void main(String[] args) {
  
  Scanner sc=new Scanner(System.in);

  System.out.println("Enter size of array:");
  int size = sc.nextInt();

  int[] arr = new int[size];
  System.out.println("Enter elements of array:");
  for(int i=0;i<size;i++){
   arr[i]=sc.nextInt();
  }

  sc.close();

  int j,i;
  for(i=0;i<size-1;i++){
   for(j=i+1;j<size;j++){
    if(arr[i]==arr[j])
     break;
   }
   if(j!=size)
    break;
  }

  if(i!=size-1)
   System.out.println("Duplicate number is "+arr[i]);
  else
   System.out.println("Duplicate number does not found!"); 

 }
}
