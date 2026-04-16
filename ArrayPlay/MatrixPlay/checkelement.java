public class checkelement {
    public boolean find(int nums[][],int k){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                if(k==nums[i][j]){
                    return true;
                }
                
            }
        }
        return false;
    }
    public static void main(String[] args) {
       checkelement obj=new checkelement();
       int nums[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
       int k=6;
       System.out.println(obj.find(nums,k));
    }
}


