import java.util.Scanner;

public class Remove_Duplicates_From_String {
 public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter string :");
  String str = sc.nextLine();

  sc.close();

  String newStr = "";
  for(int i=0;i<str.length();i++){
   char ch = str.charAt(i);
   if(newStr.indexOf(ch)==-1)
    newStr+=ch;
  }

  System.out.print("New string after removing duplicates: ");
  System.out.println(newStr);
  
 }
}
