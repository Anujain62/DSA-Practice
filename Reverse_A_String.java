import java.util.Scanner;

public class Reverse_A_String {
 public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter a string");
  String str = sc.nextLine();

  sc.close();

  String revStr = "";

  int i=str.length()-1;
  while (i>=0) {
   revStr+=str.charAt(i);
   i--;
  }

  System.out.println("Reverse string is : "+revStr);

 }
}
