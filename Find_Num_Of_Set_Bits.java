import java.util.Scanner;

public class Find_Num_Of_Set_Bits {

 public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter a number:");
  int num = sc.nextInt();

  sc.close();

  int binaryNum = 0;
  int count =0 ;
  while (num>0) {
   binaryNum = (binaryNum * 10) + (num%2);
   if(num%2==1)
    count++;
   num/=2;
  }
  System.out.println("Set bits in the binary number "+binaryNum+" is "+count);
 }
}