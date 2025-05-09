import java.util.Scanner;

public class XOR_Of_All_Num_Btw_Range {
 public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter range :");
  int start = sc.nextInt();
  int end = sc.nextInt();

  sc.close();

  int xor = start;
  for(int i=start+1;i<=end;i++){
   xor^=i;
  }

  System.out.println("XOR of all number is "+xor);
 }
}
