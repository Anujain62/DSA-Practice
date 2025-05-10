import java.util.ArrayList;
import java.util.Scanner;

public class Sort_Zero_One_Two_Array {

 public static void main(String[] args) {
  
  Scanner sc=new Scanner(System.in);

  ArrayList<Integer> arr = new ArrayList<>();
  boolean flag=true;
  System.out.println("Enter elements of array:");
  while (flag) {
   int x=sc.nextInt();
   arr.add(x);
   System.out.println("you want to continue:");
   char ch=sc.next().charAt(0);
   if(ch == 'n'  || ch == 'N')
     flag=false;
  }

  sc.close();

  System.out.println("Original array:");
  String str=arr.toString();
  System.out.println(str);

  int zero=0;
  int one=0;
  int two=0;
  for(int i=0;i<arr.size();i++){
   if(arr.get(i)==0)
     zero++;
   if(arr.get(i)==1)
    one++;
   if(arr.get(i)==2)
    two++;
  }

  arr.clear();

  while (zero>0) {
   arr.add(0);
   zero--;
  }
  while (one>0) {
   arr.add(1);
   one--;
  }
  while (two>0) {
   arr.add(2);
   two--;
  }
  str=arr.toString();
  System.out.println("After sorting the array:");
  System.out.println(str);
 }
}