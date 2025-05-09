import java.util.Scanner;

public class Count_Number_Of_Occurrences_In_Array {
 public static void main(String[] args) {
  
  Scanner sc=new Scanner(System.in);

  System.out.println("Enter size of array:");
  int size = sc.nextInt();

  int[] arr = new int[size];
  System.out.println("Enter elements of array:");
  for(int i=0;i<size;i++){
   arr[i]=sc.nextInt();
  }

  System.out.println("Enter target element:");
  int target=sc.nextInt();

  sc.close();

  int count=0;
  for(int i=0;i<size;i++){
   if(arr[i]==target)
     count++;
  }

  System.out.println("Number of occurrences of target element "+target+" is "+count);


 }
}
