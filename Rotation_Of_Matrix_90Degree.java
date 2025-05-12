import java.util.Scanner;

public class Rotation_Of_Matrix_90Degree {
 
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
   
  System.out.println("Original matrix:");  
  for(int i=0;i<row;i++){
   for(int j=0;j<column;j++)
    System.out.print(mat[i][j]+" ");
   System.out.println(); 
  }
  int[][] newMat = new int[column][row];
  int rowIdx = 0;
  int colIdx = row-1;
   for(int i=0;i<row;i++){
    rowIdx=0;
    for(int j=0;j<column;j++){
     newMat[rowIdx][colIdx] = mat[i][j];
     rowIdx++;
    }
    colIdx--;
   }
  System.out.println("After rotating 90 degree:");
   for(int i=0;i<column;i++){
   for(int j=0;j<row;j++)
    System.out.print(newMat[i][j]+" ");
   System.out.println(); 
  }
 }
}
