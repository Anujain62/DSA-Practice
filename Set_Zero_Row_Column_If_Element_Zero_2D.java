import java.util.Scanner;
public class Set_Zero_Row_Column_If_Element_Zero_2D {
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
   for(int j=0;j<column;j++){
    System.out.print(mat[i][j]+" ");
   }
   System.out.println();
  }
  
  int[] in=new int[row*column];
  int x=0;

  for(int i=0;i<row;i++){
   for(int j=0;j<column;j++){
    if(mat[i][j]==0){
     in[ x++]=i;
     in[ x++]=j;
    }
   }
  }

  int a=0;
  while (a<x) {
    for(int j=0;j<row;j++)
       mat[j][in[a+1]]=0;
    for(int j=0;j<column;j++)
       mat[in[a]][j]=0;
   a+=2;
  }

  System.out.println("New Matrix :");
  for(int i=0;i<row;i++){
   for(int j=0;j<column;j++){
    System.out.print(mat[i][j]+" ");
   }
   System.out.println();
  }

 }
}
