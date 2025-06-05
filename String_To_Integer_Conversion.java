import java.util.Scanner;

public class String_To_Integer_Conversion {
 public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter a string:");
  String str = sc.next();
  sc.close();

  int[] intArr = new int[str.length()];
  for(int i=0;i<str.length();i++){
   intArr[i] = (int)str.charAt(i);
  }

  System.out.println("String to int :");
  for(int ele:intArr)
   System.out.print(ele+" ");
 }
}
