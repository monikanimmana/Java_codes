import java.util.Arrays;

public class LC_1991 {
    public int FindMiddleIndex(int nums[]){
        int rightsum=0;
        int leftsum=0;
        for(int x:nums){
            rightsum+=x;
        }
        for(int i=0;i<nums.length;i++){
            rightsum-=nums[i];
            if(rightsum == leftsum){
                return i;
            }
            leftsum+=nums[i];

        }
        return -1;
    }
    public static void main(String[] args) {
        LC_1991 obj=new LC_1991();
        int nums[] = new int[]{1,-1,4};
        System.out.println((obj.FindMiddleIndex(nums)));
    }
}
