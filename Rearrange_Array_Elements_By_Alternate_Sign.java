import java.util.Scanner;

public class Rearrange_Array_Elements_By_Alternate_Sign {
 public static void main(String[] args) {
  
  Scanner sc=new Scanner(System.in);

  System.out.println("Enter size of array:");
  int size = sc.nextInt();

  int[] arr = new int[size];
  System.out.println("Enter elements of array:");
  for(int i=0;i<size;i++){
   arr[i]=sc.nextInt();
  }

  sc.close();

  // int size=10;
  // int[] arr = {-5,-2,5,2,4,7,1,8,0,-8};

  int i,j,idx;
  for(i=0;i<size;i+=2){
   idx=0;

   if(arr[i]>0) {
    for(j=i+1;j<size;j++){
     if(arr[j]<0){
      idx=j;
      break;
     }
    }
    if(j==size)
     break;
    else{
     int temp=arr[idx];
     for(int x=idx;x>i;x--)
      arr[x]=arr[x-1];
     arr[i+1]=temp;
    } 
   }

   else{
    for(j=i+1;j<size;j++){
     if(arr[j]>0){
      idx=j;
      break;
     }
    }
    if(j==size)
      break;
    else{
     int temp=arr[idx];
     for(int x=idx;x>i;x--)
      arr[x]=arr[x-1];
     arr[i]=temp; 
    }  
   }

  }

  System.out.print("Array after sorting alternative sign : [ ");
  for(int e:arr)
   System.out.print(e+" ");
  System.out.println("]"); 

 }
}
