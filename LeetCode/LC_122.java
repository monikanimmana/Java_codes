public class LC_122 {
    public int BuySell2(int nums[]){
        int buyprice=nums[0];
        int max_price=0;
        for(int i=1;i<nums.length;i++){
            int profit= nums[i]-buyprice;

            if(profit>0){
                max_price += profit;
            }

            buyprice=nums[i];
        }
        return max_price;
    }
    public static void main(String[] args) {
        LC_122 obj=new LC_122();
        int nums[] = new int[]{1,3,2,8,4,9};
        System.out.println(obj.BuySell2(nums));
    }
}
