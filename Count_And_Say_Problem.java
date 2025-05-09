import java.util.Scanner;
public class Count_And_Say_Problem {
 public static void main(String[] args) {

  Scanner sc= new Scanner(System.in);
  System.out.println("Enter a number :");
  int n=sc.nextInt();
  sc.close();

  String str= "1";
  int count;

  while (n>0) {
    String tempStr = "";

    for(int i=0;i<str.length();i+=count){
    char ch= str.charAt(i);
    count =1;
    for(int j=i+1;j<str.length();j++){
     int x=str.charAt(j);
     if(ch == x)
      count++;
     else
      break; 
    }

    switch(count){
     case 1:
       tempStr = tempStr +"1";
       break;
     case 2:
       tempStr = tempStr +"2";
       break; 
     case 3:
       tempStr = tempStr +"3";
       break;
     case 4:
       tempStr = tempStr +"4";
       break;    
     case 5:
       tempStr = tempStr +"5";
       break;
     case 6:
       tempStr = tempStr +"6";
       break; 
     case 7:
       tempStr = tempStr +"7";
       break;
     case 8:
       tempStr =tempStr +"8";
       break;    
     case 9:
       tempStr = tempStr +"9";
       break;          
    } 

    tempStr+=ch;
   }
   
   str = tempStr;
   n--;
  }
  System.out.println("Problem : "+str);
 }
}
