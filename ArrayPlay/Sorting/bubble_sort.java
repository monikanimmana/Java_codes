
import java.util.Arrays;
public class bubble_sort {
    public int[] sortelements(int nums[]){
        int n=nums.length;
        for(int i=n-1;i>=1;i--){
            for(int j=0;j<=i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        bubble_sort obj=new bubble_sort();
        int nums[]=new int[]{13,24,2,56,34,26,1};
        System.out.println(Arrays.toString(obj.sortelements(nums)));
    }
    
}
