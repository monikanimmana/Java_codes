
public class kadanesum1{
    public void findmaxsumIndex(int nums[]){
        int sum=0;
        int max_sum=Integer.MIN_VALUE;
        int i=0;
        int j=0;
        int n=nums.length;
        int start_index=-1;
        int end_index=-1;
        while(j<n){
            sum+=nums[j];
            if(sum > max_sum){
                max_sum=sum;
                start_index=i;
                end_index=j;
            }
            if(sum<0){
                sum=0;
                i=j+1;
            }
            j++;
            

        }
        System.out.println(max_sum);
        System.out.println(start_index + " "+ end_index);
    }
    public static void main(String[] args) {
        kadanesum1 obj=new kadanesum1();
        int nums[]= new int[]{3,-2,5,-1};
        obj.findmaxsumIndex(nums);

    }

}
