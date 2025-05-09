// Move all negative numbers to begining and positive to end



import java.util.ArrayList;
import java.util.Scanner;

public class Sort_Negative_And_Positive_An_Array {
 public static void main(String[] args) {
  
  Scanner sc=new Scanner(System.in);

  ArrayList<Integer> arr = new ArrayList<>();
  // boolean flag=true;
  // System.out.println("Enter elements of array:");
  // while (flag) {
  //  int x=sc.nextInt();
  //  arr.add(x);
  //  System.out.println("you want to continue:");
  //  char ch=sc.next().charAt(0);
  //  if(ch == 'n'  || ch == 'N')
  //    flag=false;
  // }

  sc.close();

  arr.add(8);
  arr.add(-2);
  arr.add(-3);
  arr.add(7);
  arr.add(1);
  arr.add(-1);

  System.out.println("Original array:");
  String str=arr.toString();
  System.out.println(str);

  int idx=0;

  int y=0;
  int count=0;
  int j;
  for(int i=0;i<arr.size();i++){
    int x=arr.get(i);
    if(x<0 && count%2==0){
      for(j=i+1;j<arr.size();j++){
        y=arr.get(j);
        if(y>0){
          idx=j;
          break;
        }
      }
      if(j!=arr.size()){
        arr.add(i, y);
        arr.remove(i+1);
        arr.add(idx, x);
        arr.remove(idx+1);
        idx++;
        count++;
      }
    }
    else{
      for(j=i+1;j<arr.size();j++){
        y=arr.get(j);
        if(y<0){
          idx=j;
          break;
        }
      }
      arr.add(i, y);
      arr.remove(i+1);
      arr.add(idx, x);
      arr.remove(idx+1);
      idx++;
      count++;
    }
  }

  // for(int i=0;i<6;i++){
  //  int x=arr.get(i);
  //   if(x<0){
  //    int y=arr.get(idx);
  //    arr.add(i, y);
  //    arr.add(idx, x);
  //    System.out.println("Size=>"+arr.size());
  //    idx++;
  //   }
  // }

  System.out.println("After sorting the array:");
  str=arr.toString();
  System.out.println(str);

 }
}
