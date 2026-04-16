public class LC_74{
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(target==matrix[i][j]){
                    return true;
                }
                
            }
        }
        return false;
    }
    public static void main(String[] args) {
        LC_74 obj=new LC_74();
        int nums[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int target=6;
        System.out.println(obj.searchMatrix(nums, target));
    }
}