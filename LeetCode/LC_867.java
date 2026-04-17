import java.util.Arrays;
public class LC_867 {
    public int[][] transposeMatrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(j>i){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;

                }

            }
        }
        return matrix;
        
    }
    public static void main(String[] args) {
        LC_867 obj=new LC_867();
        int matrix[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(obj.transposeMatrix(matrix)));
    }
}
