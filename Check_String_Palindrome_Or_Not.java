import java.util.Scanner;

public class Check_String_Palindrome_Or_Not {
 public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a string");
  String str = sc.nextLine();
  sc.close();
  String tempStr = str;

  str = str.toUpperCase();
  String revStr = "";
  int i=str.length()-1;
  while (i>=0) {
   revStr+=str.charAt(i);
   i--;
  }
  if(revStr.equals(str))
   System.out.println("String "+tempStr+" is palindrome");
  else 
   System.out.println("String "+tempStr+" is not palindrome");
 }
}
