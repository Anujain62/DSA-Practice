import java.util.Scanner;
public class Spiral_Traversal {
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
  
  int top = 0;
  int bottom = row-1;
  int left = 0;
  int right = column-1;

  System.out.println("Spiral Traversal:");
  while (top<=bottom && left<=right) {
   // for top row
   for(int i=left;i<=right;i++)
    System.out.print(mat[top][i]+" ");
   top++; 
   // for right column
   for(int i=top;i<=bottom;i++)
    System.out.print(mat[i][right]+" ");
   right--;
   // fot bottom row
   if(top<=bottom){
    for(int i=right;i>=left;--i)
     System.out.print(mat[bottom][i]+" ");
    bottom--; 
   }
   // for left row
   if(left<=right){
    for(int i=bottom;i>=top;--i)
     System.out.print(mat[i][left]+" ");
    left++; 
   }
  }
 }
}
