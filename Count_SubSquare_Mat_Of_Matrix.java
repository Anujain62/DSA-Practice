import java.util.Scanner;

public class Count_SubSquare_Mat_Of_Matrix {
 public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter size of the Square matrix:");
  int size  = sc.nextInt();
  int[][] mat = new int[size][size];
  System.out.println("Enter elements :");
  for(int i=0;i<size;i++){
   for(int j=0;j<size;j++)
    mat[i][j] = sc.nextInt();
  }
  System.out.println("Enter target element:");
  int target = sc.nextInt();
  sc.close();
  int sum = 0;
  int left = 0;
  int right = 1;
  int up = 1;
  int down = 2;
  int count = 0;
  for(int i=0;i<size;i++)
   for(int j=0;j<size;j++)
    sum += mat[i][j];
  if(sum==target)  
   count++;
  sum = 0; 
  while (right<size) {
   for(int i=0;i<=1;i++){
    for(int j=left;j<=right;j++){
     sum += mat[i][j];
    }
   }
   if(sum==target)
    count++;
   left++;
   right++;
   sum=0;
   while (down<size) {
    for(int i=up;i<=down;i++)
     for(int j=left;j<=right;j++)
      sum+=mat[i][j];
    if(sum==target)
     count++;
    up++;
    down++;
    sum=0;   
   } 
  }
  System.out.println("Number of sub-square matrix :"+count);
 }
}
