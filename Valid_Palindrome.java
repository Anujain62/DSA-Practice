// Valid palindrome after removing at most one character

import java.util.Scanner;

public class Valid_Palindrome {
 public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);

  // System.out.println("Enter a string:");
  // StringBuilder str = new StringBuilder(sc.next());

  StringBuilder str = new StringBuilder("namaan");

  sc.close();
  int left = 0;
  int right = str.length()-1;
  int count = 1;

  while (left<right && count>0) {    
   char leftChar = str.charAt(left);
   char rightChar = str.charAt(right);

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

  StringBuilder tempStr = new StringBuilder(str.reverse());

  if(tempStr.equals(str))
   System.out.println("Valid Palindrome");
  else
   System.out.println("Invalid Palindrome"); 
  
 }
}
