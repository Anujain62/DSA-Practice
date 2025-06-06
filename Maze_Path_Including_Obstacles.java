import java.util.Scanner;

public class Maze_Path_Including_Obstacles {

 static int row ,column;

 static void PathWithObstacles(String str,int r,int c,int rowIdx,int colIdx){
  if(r==row-1 && c==column-1){
   System.out.println(str);
   return;
  }
  if (r==rowIdx && c==colIdx)
   return;
  if(r<row)
   PathWithObstacles(str+"V", r+1, c,rowIdx,colIdx);
  if(c<column)
   PathWithObstacles(str+"H", r, c+1,rowIdx,colIdx);
 }

 public static void main(String[] args) {
  
   Scanner sc = new Scanner(System.in);
  System.out.println("Enter number of row:");
  row = sc.nextInt();
  System.out.println("Enter number of column:");
  column = sc.nextInt();
 
  System.out.println("Enter row for obstacles:");
  int rowIdx = sc.nextInt();
  System.out.println("Enter column for obstacles:");
  int colIdx = sc.nextInt();
  sc.close();

  System.out.println("Path for obstacles:");
  PathWithObstacles("", 0,0, rowIdx, colIdx);
 }
}
