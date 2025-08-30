import java.util.Scanner;

public class Maze_Path_Including_All_Directions {

  static int row ,column;

 static void allPaths(String str ,boolean[][]maze, int r,int c){
  if(r==row-1 && c==column-1){
   System.out.println(str);
   return;
  }
  if(!maze[r][c])
   return;
  maze[r][c]=false;
  if(r<maze.length-1)
   allPaths(str+"D",maze, r+1, c);
  if(c<maze[0].length-1)
   allPaths(str+"R",maze, r, c+1);
  if(r>0)
   allPaths(str+"U", maze, r-1, c);
  if(c>0)
  allPaths(str+"L", maze, r, c-1);
  maze[r][c] = true;
 }
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number of row:");
  row = sc.nextInt();
  System.out.println("Enter number of column:");
  column = sc.nextInt();
  sc.close();
  boolean[][] maze = new boolean[row][column];
  for(int i=0;i<row;i++){
   for(int j=0;j<column;j++)
    maze[i][j] = true;
  }
  System.out.println("All Paths :");
  allPaths("", maze, 0, 0);
 }
}
