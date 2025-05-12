import java.util.Scanner;
public class Multiplication_Of_2D_Matrix {
 public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);

  System.out.println("Rows of first matrix:");
  int row1 = sc.nextInt();
  System.out.println("Columns of first matrix:");
  int column1 = sc.nextInt();
  int[][] mat1 = new int[row1][column1];

  System.out.println("Enter elements of first matrix:");
  for(int i=0;i<row1;i++)
   for(int j=0;j<column1;j++)
    mat1[i][j] = sc.nextInt();

  System.out.println("Rows of second matrix:");
  int row2 = sc.nextInt();
  System.out.println("Columns of second matrix:");
  int column2 = sc.nextInt();
  int[][] mat2 = new int[row2][column2];

  System.out.println("Enter elements of second matrix:");
  for(int i=0;i<row2;i++)
   for(int j=0;j<column2;j++)
    mat2[i][j] = sc.nextInt();  
  sc.close();

  System.out.println("Matrix 1 :");
  for(int i=0;i<row1;i++){
   for(int j=0;j<column1;j++)
    System.out.print(mat1[i][j]+" ");
   System.out.println(); 
  }

  System.out.println("Matrix 2 :");
  for(int i=0;i<row2;i++){
   for(int j=0;j<column2;j++)
    System.out.print(mat2[i][j]+" ");
   System.out.println(); 
  }

  if(row1==column2){
   int[][] ansMat = new int[row1][column2];
   for(int i=0;i<row1;i++){
    for(int j=0;j<column2;j++){
     ansMat[i][j]=0;
     for(int k=0;k<row1;k++){
      ansMat[i][j] += (mat1[i][k]*mat2[k][j]);
     }
    }
   }
   System.out.println("Final matrix:");
   for(int i=0;i<row1;i++){
    for(int j=0;j<column2;j++)
     System.out.print(ansMat[i][j]+" ");
    System.out.println(); 
   }
  }
  else{
   System.out.println("Multiplication does not exist");
  }
 }
}
