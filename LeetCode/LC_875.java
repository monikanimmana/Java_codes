public class LC_875 {
    public int findhour(int nums[],int k){
        int hour=0;
        for(int i:nums){
            hour += Math.ceil((double)i/(double)k);
        }
        return hour;
    }
    public int findMinSpeed(int nums[],int h){
        int k=0;
        int low=1;
        int high=Integer.MIN_VALUE;
        for(int i:nums){
            high=Math.max(high,i);
        }
        while(low<=high){
            k=(low+high)/2;
            int hour=findhour(nums , k);
            if(hour<=h){
                high=k-1;
            }else{
                low=k+1;
            }

        }
        return low;
    }
    public static void main(String[] args) {
        LC_875 obj=new LC_875();
        int nums[]=new int[]{3,6,7,11};
        int h=8;
        System.out.println(obj.findMinSpeed(nums, h));
    }
}
