import java.util.Scanner;

public class Median_Of_Row_Wise_Sorted_Matrix {
 public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number of rows:");
  int row = sc.nextInt();

  System.out.println("Enter number of columns:");
  int column = sc.nextInt();

  int[][] mat = new int[row][column];
  System.out.println("Enter elements of matrix:");
  for(int i=0;i<row;i++)
   for(int j=0;j<column;j++)
    mat[i][j] = sc.nextInt();

  sc.close();
  int[] newMat = new int[row*column];
  int idx=0;
  for(int i=0;i<row;i++)
   for(int j=0;j<column;j++){
    newMat[idx] = mat[i][j];
    idx++;
   }
  for(int i=0;i<idx;i++){
   int temp = newMat[i];
   for(int j=i+1;j<idx;j++){
    if(temp>newMat[j]){
     newMat[i] = newMat[j];
     newMat[j] = temp;
     temp = newMat[i];
    }
   }
  }
  System.out.println("Single Di-mensional Matrix:");
  for(int ele: newMat)
   System.out.print(ele+" ");
  int medianIdx = (idx-1)/2;
  System.out.println("\nMedian :"+newMat[medianIdx]);
 }
}
