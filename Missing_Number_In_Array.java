import java.util.Scanner;

public class Missing_Number_In_Array {
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

  int arrSum=0;
  for(int i=0;i<size;i++)
   arrSum+=arr[i];
  
  int allNumSum = (size+1)*(size+2)/2;
  int missNum = allNumSum - arrSum; 

  System.out.println("Missing number is "+missNum);

 }
}
