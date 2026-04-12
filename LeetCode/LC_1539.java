public class LC_1539 {
    public int findKthPositive(int nums[],int k){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int index = nums[mid]-(mid+1);
            if(index<k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }


        // high+1+k is came for derivation
        //missing_index=k-((nums[high]-(high+1))  , missing_value = missing_index + nums[high]
        //missing_value= nums[high] + missing_index
        // nums[high] + k-((nums[high]-(high+1))
        //nums[high] + k - nums[high] +high +1;
        //missing_value = k+high+1;


        return high+1+k; //or low+k where low=high+1;      
    }
    public static void main(String[] args) {
        LC_1539 obj = new LC_1539();
        int nums[]=new int[]{1,3};
        int k=1;
        System.out.println(obj.findKthPositive(nums, k));
    }
}
