public class kadanesbuysell{
    public int profitloss(int nums[]){
        int buy=-1;
        int min_price=Integer.MAX_VALUE;
        int max_profit=0;
        int sell=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min_price){
                min_price=nums[i];
                buy=i;
            }
             if(nums[i]-min_price > max_profit){
                max_profit=nums[i]-min_price;
                sell=i;
             }
        
        }
        System.out.println(buy + " " + sell);
        return max_profit;
    }
    public static void main(String[] args) {
        kadanesbuysell obj=new kadanesbuysell();
        int nums[] = new int[]{10,1,5,6,7,1};
        System.out.println(obj.profitloss(nums));
    }
    
}