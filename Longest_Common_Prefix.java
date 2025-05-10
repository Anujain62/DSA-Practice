import java.util.Scanner;

public class Longest_Common_Prefix {
 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  System.out.println("Enter number of strings :");
  int n = sc.nextInt();

  String[] arr = new String[n];
  System.out.println("Enter strings :");
  for(int i=0;i<n;i++)
   arr[i] = sc.next();

  sc.close();

  int size = arr[0].length();
  for(int i=1;i<n;i++){
   int x=arr[i].length();
   arr[i] = arr[i].toLowerCase();
   if(x<size)
    size=x;
  }
  
  int j;
  String prefix = "";
  for(int i=0;i<size;i++){
   char ch= arr[0].charAt(i);
   for(j=1;j<n;j++){
    char x= arr[j].charAt(i);
    if(x!=ch)
     break;
   }
   if(j==n)
     prefix+=ch;
  }

  System.out.println("Longest prefix is :"+prefix);

 }
}
