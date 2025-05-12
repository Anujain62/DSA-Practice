import java.util.Scanner;

public class Search_Substring {
 public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter a string:");
  String str  = sc.next();

  System.out.println("Enter sub-string:");
  String subStr  = sc.next();

  sc.close();

  int n = str.indexOf(subStr);
  if(n==-1)
   System.out.println("Sub-string does not found!");
  else
   System.out.println("Sub-string is found at index "+n); 

 }
}
