import java.util.Scanner;

public class Pascal_Triangle {
 public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter number of rows:");
  int n = sc.nextInt();

  sc.close();

  for(int i=0;i<n;i++){
   for(int j=0;j<n-i-1;j++)
    System.out.print(" ");
   for(int j=0;j<=i;j++){
    int fact = factorial(i,j);
    System.out.print(fact+" ");
   } 
   System.out.println();
  }
  
 }

 static int factorial(int x,int y){
  int fact1=1;
  int fact2=1;
  int fact3=1;
  for(int i=1;i<=x;i++){
   fact1*=i;
  }
  for(int i=1;i<=y;i++){
   fact2*=i;
  }
  for(int i=1;i<=x-y;i++){
   fact3*=i;
  }
  return fact1/(fact2*fact3);
 }

}
