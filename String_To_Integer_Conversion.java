import java.util.Scanner;

public class String_To_Integer_Conversion {
 public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter a string:");
  String str = sc.next();
  sc.close();

  int i = Integer.valueOf(str);
  System.out.println("Value of int :" +i);
 }
}
