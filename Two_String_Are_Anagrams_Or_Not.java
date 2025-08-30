import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Two_String_Are_Anagrams_Or_Not {
 public static void main(String[] args) {
  
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter first string:");
  String str1 = sc.next();
  System.out.println("Enter second string:");
  String str2 = sc.next();
  sc.close();

  if(isAnagram(str1,str2)){
    System.out.println("Both are anagrams!");
  }
  else{
    System.out.println("Both are not anagrams!");
  }
 }

 public static boolean isAnagram(String str1,String str2){

  if(str1.length()!=str2.length())
    return false;

   Map<Character,Integer> frequency = new HashMap<>();

    for(char c:str1.toLowerCase().toCharArray()){
       frequency.put(c, frequency.getOrDefault(c,0)+1);
    }

    for(char c:str2.toLowerCase().toCharArray()){
      if(!frequency.containsKey(c) || frequency.get(c)==0)
       return false;
      frequency.put(c,frequency .get(c)-1); 
    }
  return true;

 }

}
