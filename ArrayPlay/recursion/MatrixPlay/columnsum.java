public class columnsum {
    public int colsum(int nums[][]){
        int sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int j=0;j<nums[0].length;j++){
            for(int i=0;i<nums.length;i++){
                sum += nums[i][j];
            }
            max_sum=Math.max(max_sum, sum);
            sum=0;
        }
        return max_sum;
    }
    public static void main(String[] args) {
       columnsum obj=new columnsum();
       int nums[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
       System.out.println(obj.colsum(nums));
    }
}


