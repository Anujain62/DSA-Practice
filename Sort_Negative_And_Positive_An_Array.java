// Move all negative numbers to begining and positive to end

import java.util.ArrayList;
import java.util.Scanner;

public class Sort_Negative_And_Positive_An_Array {
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
        System.out.println(arr);

        int idx = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                int temp = arr.get(i);
                arr.remove(i);
                arr.add(idx, temp);
                idx++;
            }
        }

        System.out.println("After separating negatives and positives:");
        System.out.println(arr);

 }
}
