import java.util.Arrays;
public class Aggressivecows {
    public int mindist(int nums[], int cows){
        Arrays.sort(nums);
        int n=nums.length;
        int low=0;
        int high=nums[n-1]-nums[0];
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canplace(nums, mid, cows)){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return high;
    }
    public boolean canplace(int nums[], int min_dist , int cows){
        int cow_count=1;int last_cow=nums[0];
        for(int i=1;i<nums.length;i++){
            if((nums[i]-last_cow) >= min_dist){
                cow_count++;
                last_cow=nums[i];
            }
            if(cow_count>=cows){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Aggressivecows obj =new Aggressivecows();
        int nums[]=new int[]{0,3,4,7,9,10};
        int cows=4;
        System.out.println(obj.mindist(nums, cows));

    }
}
