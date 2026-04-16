public class maxsum {
    public int sum(int nums[][]){
        int sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                sum += nums[i][j];
            }
            max_sum=Math.max(max_sum,sum);
            sum=0;
        }
        return max_sum;
    }
    public static void main(String[] args) {
       maxsum obj=new maxsum();
       int nums[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
       System.out.println(obj.sum(nums));
    }
}


