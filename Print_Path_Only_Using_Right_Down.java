import java.util.Scanner;
public class Print_Path_Only_Using_Right_Down {
 static int row ,column;
 static void printPathsRD(String str,int r,int c){
  if(r==row-1 && c==column-1){
   System.out.println(str);
   return;
  }
  if(r<row)
   printPathsRD(str+"V", r+1, c);
  if(c<column)
   printPathsRD(str+"H", r, c+1);
 }
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number of row:");
  row = sc.nextInt();
  System.out.println("Enter number of column:");
  column = sc.nextInt();
  sc.close();
  System.out.println("Paths:");
  printPathsRD("", 0, 0);
 }
}
