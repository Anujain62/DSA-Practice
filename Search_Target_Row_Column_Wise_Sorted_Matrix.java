import java.util.Scanner;

public class Search_Target_Row_Column_Wise_Sorted_Matrix {
 
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

  System.out.println("Enter target element:");  
  int target = sc.nextInt();
 sc.close();   

 int i = 0;
 int j = column-1;
 boolean flag = false;
 while (i<row && j>=0) {
  if(mat[i][j]==target){
   flag = true;
   break;
  }
  else if(target>mat[i][j])
   i++;
  else
   j--; 
 }
 if(flag)
  System.out.println("Target find at index "+i+","+j);
 else 
  System.out.println("Target not found!");
 }
}
