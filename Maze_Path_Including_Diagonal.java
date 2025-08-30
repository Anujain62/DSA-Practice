import java.util.Scanner;
public class Maze_Path_Including_Diagonal {
 static int row ,column;
 static void printPathsIncludeDigonal(String str,int r,int c){
  if(r==row-1 && c==column-1){
   System.out.println(str);
   return;
  }
  if(r<row)
   printPathsIncludeDigonal(str+"V", r+1, c);  // for downward direction
  if(c<column)
   printPathsIncludeDigonal(str+"H", r, c+1);  // for left direction
  if(r<row && c<column)
   printPathsIncludeDigonal(str+"D", r+1, c+1);  // for diagonal direction
 }
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number of row:");
  row = sc.nextInt();
  System.out.println("Enter number of column:");
  column = sc.nextInt();
  sc.close();
  System.out.println("Path including diagonal:");
  printPathsIncludeDigonal("", 0, 0);
 }
}
