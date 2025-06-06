import java.util.Scanner;
public class Find_Small_Char_An_Array_Greater_Target {
 static String findTarget(String[] strArr,String target){
  if(target.equals("z"))
   return strArr[0];
  for(int i=0;i<strArr.length;i++){
   if(target.compareTo(strArr[i])<0)
    return strArr[i];
  } 
  return "Null";
 }
 public static void main(String[] args) { 
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter size of the array:");
  int size =sc.nextInt();
  String[] strArr = new String[size];
  System.out.println("Enter strings of the array:");
  for(int i=0;i<size;i++)
   strArr[i] = sc.next();
  System.out.println("Enter target string:");
  String target = sc.next();
  sc.close();
  System.out.println("Answer :"+findTarget(strArr, target));
 }
}
