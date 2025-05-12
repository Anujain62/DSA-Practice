import java.util.Scanner;

public class Diagonal_Element_Printing_2D_Matrix {
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

  if(row==column){
   System.out.println("Diagonal elements:");
   for(int i=0;i<row;i++){
    for(int j=0;j<column;j++)
     if(i==j)
     System.out.print(mat[i][j]+" ");
   }   
  }
  else
   System.out.println("It's not square matrix!");
 }
}
