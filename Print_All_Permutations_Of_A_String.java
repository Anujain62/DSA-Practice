import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Print_All_Permutations_Of_A_String {
 public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a string:");
  String str = sc.next();
  sc.close();

  Map<Character,Integer> frequency = new HashMap<>();
  for(char c:str.toCharArray()){
   frequency.put(c, frequency.getOrDefault(c, 0)+1);
  }
  
  char[] permutations = new char[str.length()];
  System.out.println("All permutations:");
  allPermutations(permutations,0,frequency);
 }

 public static void allPermutations(char[] permutations,int idx,Map<Character,Integer>frequency){
  if(idx==permutations.length){
   System.out.println(String.valueOf(permutations));
   return;
  }
  for(Map.Entry<Character,Integer>entry : frequency.entrySet()){
   char c = entry.getKey();
   int fre = entry.getValue();
   if(fre>0){
    permutations[idx] = c;
    frequency.put(c, fre-1);
    allPermutations(permutations, idx+1, frequency);
    frequency.put(c, fre);
   }
  }
 }
 
}
