public class countelement{
    public int elementcount(int nums[][]){
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
       countelement obj=new countelement();
       int nums[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
       System.out.println(obj.elementcount(nums));
    }
}