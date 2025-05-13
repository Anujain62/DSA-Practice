import java.util.Scanner;
public class Max_Rectangle_Of_1s{
 
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

  System.out.println("Original matrix:");  
  for(int i=0;i<row;i++){
    for(int j=0;j<column;j++)
     System.out.print(mat[i][j]+" ");
    System.out.println(); 
  }

  sc.close();

  int[][] tempMat = new int[row][column];
  int ans = 0;
  for(int i=0;i<row;i++){
    for(int j=0;j<column;j++){
      if(mat[i][j]==0)
       continue;
      if(j==0)
       tempMat[i][j] = 1;
      else
       tempMat[i][j] = 1 + tempMat[i][j-1];
      int width = tempMat[i][j];
      for(int k=i;k>=0;k--){
        width = Math.min(width, tempMat[k][j]);
        int area = width * (i-k+1);
        ans = Math.max(ans, area);
      }  
    }
  }
  System.out.println("Rectange size :"+ans);
 }
}
