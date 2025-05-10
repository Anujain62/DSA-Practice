import java.util.Scanner;

public class Find_All_Pairs_With_Given_Sum {
 public static void main(String[] args) {
  
  Scanner sc=new Scanner(System.in);

  System.out.println("Enter size of array:");
  int size = sc.nextInt();

  int[] arr = new int[size];
  
  System.out.println("Enter elements of array:");
  for(int i=0;i<size;i++){
   arr[i]=sc.nextInt();
  }

  System.out.println("Enter sum :");
  int sum = sc.nextInt();

  sc.close();

  int[][] ansArr = new int[size*2][2];
  int ansIdx=0;

  for(int i=0;i<size-1;i++){
   for(int j=i+1;j<size;j++){
    if(arr[i]+arr[j]==sum){
     ansArr[ansIdx][0]=arr[i];
     ansArr[ansIdx][1]=arr[j];
     ansIdx++;
    }
   }
  }

  System.out.println("All pairs :");
  System.out.print("[ ");

  for(int i=0;i<ansIdx;i++){
   System.out.print("[ ");
   for(int j=0;j<2;j++){
    System.out.print(ansArr[i][j]+" ");
   }
   if(i!=ansIdx-1)
    System.out.print("] , ");
   else
   System.out.print("] "); 
  }

  System.out.print(" ]");

 }
}
