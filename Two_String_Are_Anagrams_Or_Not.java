import java.util.Scanner;

public class Two_String_Are_Anagrams_Or_Not {
 public static void main(String[] args) {
  
  Scanner sc=new Scanner(System.in);

  // System.out.println("Enter first string:");
  // String str1 = sc.next();

  // System.out.println("Enter second string:");
  // String str2 = sc.next();

  String str1 = "geeks";
  String str2 = "ksept";

  String tempStr = "";

  int i;
  for(i=0;i<str1.length();i++){
    char ch = str1.charAt(i);
   int count=1;
   int tempCount = 0;
    for(int j=i+1;j<str1.length();j++){
    if(ch==str1.charAt(j))
     count++;
   }
   for(int j=0;j<str2.length();j++){
    if(ch==str2.charAt(j))
     tempCount++;
   }
   if(tempCount==count && !tempStr.equals(ch))
    tempStr = tempStr + ch;
   System.out.println(i);
  }

  if(str1.length()==str2.length())
   System.out.println("Both Strings Are Anagrams!");
  else
   System.out.println("Both Strings Are Not Anagrams!"); 
 }
}
