import java.util.Scanner;
public class Flip_And_Invert_Image {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number of rows:");
  int row = sc.nextInt();
  System.out.println("Enter number of columns:");
  int column = sc.nextInt();
  int[][] arr = new int[row][column];
  System.out.println("Enter elements of 2D-Array:");
  for(int i=0;i<row;i++)
   for(int j=0;j<column;j++)
    arr[i][j]=sc.nextInt();
  sc.close();
  System.out.println("Original array :");
   for(int i=0;i<row;i++){
    for(int j=0;j<column;j++)
     System.out.print(arr[i][j]+" ");
    System.out.println();  
   }
  for(int i=0;i<row;i++){
   int left = 0;
   int right = column-1;
   while (left<right) {
    int temp = arr[i][left];
    arr[i][left] = arr[i][right];
    arr[i][right] = temp;
    left++;
    right--;
   }
  }
  for(int i=0;i<row;i++){
   for(int j=0;j<column;j++){
    if(arr[i][j]==0)
     arr[i][j]=1;
    else 
     arr[i][j]=0;
   }
  }
  System.out.println("New array :");
  for(int i=0;i<row;i++){
    for(int j=0;j<column;j++)
     System.out.print(arr[i][j]+" ");
    System.out.println();  
   }
 }
}
