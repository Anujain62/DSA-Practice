import java.util.Scanner;

public class Floor_Of_A_Number {
 public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter size of array:");
  int size = sc.nextInt();

  int[] arr = new int[size];
  System.out.println("Enter elements of array:");
  for(int i=0;i<size;i++)
   arr[i]=sc.nextInt();

  System.out.println("Enter targeted element :"); 
  int target = sc.nextInt();

  sc.close();

  int i;
  for(i=0;i<size-1;i++){
   if(arr[i]==target){
    System.out.println("Target is present at "+i+" index");
    break;
   }
   else if((target-1 == arr[i]) && (target+1 == arr[i+1])){
    System.out.println("Target is not present but it's floor number is "+arr[i]);
    break;
   } 
  } 
  if(i==size-1 && (arr[i]+1)==target){
   System.out.println("Target is not present but it's floor number is "+arr[i]); 
  }
  
 }
}
