import java.util.Scanner;
public class Boolean_Matrix_Problem {
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

  int[] temp = new int[row*column];
  int idx = 0;
  for(int i=0;i<row;i++){
   for(int j=0;j<column;j++){
    if(mat[i][j]==1){
     temp[idx++] = i;
     temp[idx++] = j;
    }
   }
  }
  for(int i=0;i<idx;i+=2){
   for(int j=0;j<row;j++)
    mat[j][temp[i+1]] = 1;
   for(int j=0;j<column;j++)
    mat[temp[i]][j] = 1; 
  }
  System.out.println("New matrix:");
  for(int i=0;i<row;i++){
    for(int j=0;j<column;j++)
     System.out.print(mat[i][j]+" ");
    System.out.println(); 
  }
 }
}
