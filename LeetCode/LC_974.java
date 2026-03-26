import java.util.HashMap;

public class LC_974 {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int n=nums.length;
        int sum=0;
        int rem=0;
        map.put(0,1);
        for(int i=0;i<n;i++){
            sum +=nums[i];
            rem=sum%k;
            if(rem<0){
                rem=rem+k;
            }
            if(map.containsKey(rem)){
                count+=map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        LC_974 obj = new LC_974();
        int nums[] = new int[]{4,5,0,-2,-3,1};
        int k=5;
        System.out.println(obj.subarraysDivByK(nums,k));
    }
}

