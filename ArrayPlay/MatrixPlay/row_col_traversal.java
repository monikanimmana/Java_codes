public class row_col_traversal {
    public void elementinrows(int nums[][]){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                System.out.print(nums[i][j]);
            }
        }
        System.out.println();   
    }
    public void elementincol(int nums[][]){
        for(int j=0;j<nums[0].length;j++){
            for(int i=0;i<nums.length;i++){
                System.out.print(nums[i][j]);
            }
        }
    }
    public static void main(String[] args) {
       row_col_traversal obj=new row_col_traversal();
       int nums[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
       obj.elementinrows(nums);
       obj.elementincol(nums);
    } 

}
