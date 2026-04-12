public class LC_1283 {
    public int minDivisor(int nums[], int threshold){
        int low=1;
        int high=Integer.MIN_VALUE;
        for(int i:nums){
            high=Math.max(high,i);
        }
        if(threshold < nums.length) return -1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int div_sum=divisor(nums,mid, threshold);
            if(div_sum<=threshold){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public int divisor(int nums[], int mid, int threshold){
        int div_sum=0;
        for(int i:nums){
            div_sum+= (i + mid - 1) / mid;
            if(div_sum > threshold){
                return div_sum;
            }
        }
        return div_sum;

    }
    public static void main(String[] args) {
        LC_1283 obj= new LC_1283();
        int nums[]=new int[]{2,3,5,7};
        int threshold=100;
        System.out.println(obj.minDivisor(nums, threshold));
        
    }
}
