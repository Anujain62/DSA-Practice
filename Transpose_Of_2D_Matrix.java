import java.util.Scanner;

public class Transpose_Of_2D_Matrix {
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
  for(int i=0;i<row;i++){
   for(int j=0;j<column;j++)
    newMat[j][i] = mat[i][j];
  }

  System.out.println("Transpose of matrix:");
   for(int i=0;i<row;i++){
   for(int j=0;j<column;j++)
    System.out.print(newMat[i][j]+" ");
   System.out.println(); 
  }
 }
}
