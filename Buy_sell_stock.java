import java.util.Scanner;

public class Buy_sell_stock {

    static int stock(int arr[],int n){
            int profit=0,x;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    x=arr[j]-arr[i];
                    if(profit<x)
                        profit=x;
                }
            }
            if(profit==0)
                return 0;
            return profit;
        }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size of stocks:");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter stocks :");
        for(int i=0;i<size;i++)
         arr[i]=sc.nextInt();

        sc.close();
        
        System.out.println("Profit = "+stock(arr, size));
        
         
    }
}







// #include<iostream>
// using namespace std;
// int stock(int arr[],int n){
//     int profit=0,x;
//     for(int i=0;i<n;i++){
//         for(int j=i+1;j<n;j++){
//             x=arr[j]-arr[i];
//             if(profit<x)
//                 profit=x;
//         }
//     }
//     if(profit==0)
//         return 0;
//     return profit;
// }
// int main(){
//     int n;
//     cout<<"enter size of buy and sell stocks:";
//     cin>>n;
//     int arr[n];
//     cout<<"enter value of buy and sell stocks:";
//     for(int i=0;i<n;i++){
//         cin>>arr[i];
//     }
//     int x=stock(arr,n);
//     if(x==0)
//         cout<<" 0 profit";
//     else
//         cout<<"profit :"<<x;
//     return 0;
// }
