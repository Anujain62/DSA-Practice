import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Sum_of_3 {
 public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listOfLists = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                if(nums[i]+nums[left]+nums[right]==0){
                    listOfLists.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    
                    left++;
                    right--;
                }else if(nums[i]+nums[left]+nums[right]>0)
                right--;
                else
                left++;
            }
        }
             

        return listOfLists;
    }

 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  System.out.println("Enter size of the array:");
  int size = sc.nextInt();

  int[] arr = new int[size];
  System.out.println("Enter elements of the array:");
  for(int i=0;i<size;i++)
   arr[i] = sc.nextInt();

  Sum_of_3 obj = new Sum_of_3();
 System.out.println(obj.threeSum(arr));

  
 }
}