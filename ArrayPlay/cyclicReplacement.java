
import java.util.Arrays;

public class cyclicReplacement{
    public int[] cyclicArray(int nums[], int k){
        int n=nums.length;
        int i=0;
        int j=0;
        int current_value=nums[i];
        while(j<n){
            int index=(i+k)%n;
            int next_value=nums[index];
            nums[index]=current_value;
            i=index;
            current_value=next_value;
            j++;
        }
        return nums;
    }
    public static void main(String[] args) {
        cyclicReplacement obj=new cyclicReplacement();
        int nums[] = new int[]{1,2,3,4,5,6};
        int k=2;
        System.out.println(Arrays.toString(obj.cyclicArray(nums, k)));

    }
    
}