// Valid palindrome after removing at most one character

import java.util.Scanner;
public class Valid_Palindrome {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  // System.out.println("Enter a string:");
  // StringBuilder str = new StringBuilder(sc.next());
  StringBuilder str = new StringBuilder("abccbe");      
                      // abcd
  sc.close();
  int left = 0;
  int right = str.length()-1;
  int count = 1;
  while (left<right && count>0) {    
   char leftChar = str.charAt(left);
   char rightChar = str.charAt(right);
   


   System.out.println(leftChar +  " " +   rightChar);

   if(leftChar==rightChar){
    left++;
    right--;
   }
   else{
     str.deleteCharAt(right);
     count--;
     right--;
    }
   }
  System.out.println(str     +  " hello"+   str.reverse());
  StringBuilder tempStr = new StringBuilder(str.reverse());
   System.out.println(tempStr+ "    "    + str);
   String a = str.toString().trim();
   String b = tempStr.toString().trim();
   System.out.println(a.length() + "  h  " +   b.length() );
  if(a.equals(b))
   System.out.println("Valid Palindrome");
  else
   System.out.println("Invalid Palindrome");  
 }
}
