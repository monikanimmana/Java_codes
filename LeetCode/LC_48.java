import java.util.Arrays;

public class LC_48 {
    public int[][] transposeMatrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix.length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        return matrix; 
    }
    public int[][] reversematrix(int matrix[][]){
        int m=matrix[0].length;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<m/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][m-j-1];
                matrix[i][m-j-1]=temp;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        LC_48 obj=new LC_48();
        int matrix[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        obj.transposeMatrix(matrix);
        obj.reversematrix(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
