import java.util.Arrays;
public class LC_16 {
    public int threeSumCloset(int nums[],int target){
        Arrays.sort(nums);
        int min_diff = Integer.MAX_VALUE;
        int min_sum=0;
        for(int i=0;i<nums.length;i++){

            int left=i+1;
            int right=nums.length-1;

            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(Math.abs(sum-target) < min_diff){
                    min_diff=Math.abs(sum-target);
                    min_sum=sum;
                }
                if(min_diff==0){
                    return min_sum;   
                }

                if(sum>target){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return min_sum;

    }
    public static void main(String[] args) {
        LC_16 obj=new LC_16();
        int arr[] = new int[]{1, 4, 6, 8};
        int target=13;
        System.out.println(obj.threeSumCloset(arr, target));
    }
}
