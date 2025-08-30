// Q. Given the integer array fruits,return the maximum number of fruits you can pick.
// Strict rules - 
// 1) you only have two baskets and each basket can only hold a single type of fruit, no limit on the amout of fruit each basket can hold
// 2) starting from any tree of your choice,you must pick exactly one fruit from every tree while moving to the right

import java.util.Scanner;
public class Fruit_Into_Baskets {
 static int fruit(int tree[]){
  int ans[] = {-1,-1,-1,-1};
  for(int i=0;i<tree.length;i++){
   int temp = tree[i];
   int count = 0;
   for(int j=0;j<tree.length;j++)
    if(tree[j]==temp)
     count++;
   if(temp!=ans[0] && temp!=ans[2]){
    if(count>ans[1]){
     ans[0] = temp;
     ans[1] = count;
    }
    else if(count>ans[3]){
     ans[2] = temp;
     ans[3] = count;
    }
   }  
  }
  int maxCount = ans[1] + ans[3];
  return maxCount;
 }
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number of tree's :");
  int size = sc.nextInt();
  int tree[] = new int[size];
  System.out.println("Enter tree's");
  for(int i=0;i<size;i++)
   tree[i] = sc.nextInt();
  sc.close();
  int ans = fruit(tree); 
  System.out.println("Maximum Fruits :"+ans);
 }
}
