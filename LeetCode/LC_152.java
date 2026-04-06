public class LC_152 {
    public int MaxSubarrayProduct(int nums[]){
        int max_val=nums[0];
        int min_val=nums[0];
        int product=nums[0];
        for(int i=1;i<nums.length;i++){
            int curr=nums[i];

            if(curr<0){
                int temp=max_val;
                max_val=min_val;
                min_val=temp;
            }

            max_val=Math.max(curr, curr*max_val );
            min_val=Math.min(curr , curr*min_val);

            product=Math.max(product,max_val);

        }
        return product;
    }
    public static void main(String[] args) {
        LC_152 obj=new LC_152();
        int nums[] = new int[]{2,3,-2,4};
        System.out.println(obj.MaxSubarrayProduct(nums));
    }
}


//intuitive method
// int prefix=1;
// int suffix=1;
// for(int i=0;i<nums.length;i++){
//     if(prefix==0) --> prefix=1;
//     if(suffix==0) --> suffix=1;

//     prefix *=nums[i];
//     suffix *=nums[n-i-1];

//     maxi=Math.max(maxi, Math.max(prefix, suffix));
// }
// return maxi;