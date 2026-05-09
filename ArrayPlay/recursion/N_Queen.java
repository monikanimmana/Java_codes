import java.util.ArrayList;
import java.util.List;
// BRTUE FORCE METHOD
public class N_Queen {
    public List<List<String>> checkQueen(int n){
        List<List<String>> chessboard=new ArrayList<>();
        char[][] ch=new char[n][n];
        int col=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ch[i][j]='.';
            }
        }
        backtrack(col,n,ch,chessboard);
        return chessboard;
    }
    public void backtrack(int col,int n,char[][] ch,List<List<String>> chessboard){
        if(col==n){
            List<String> board=new ArrayList<>();
            for(int i=0;i<n;i++){
                board.add(new String(ch[i]));
            }

            chessboard.add(new ArrayList<>(board));
            return;
        }
        for(int row=0;row<n;row++){
            if(!isQueenPlace(n,row,col,ch)){

                ch[row][col]='Q';
                backtrack(col+1, n, ch, chessboard);
                ch[row][col]='.';
                             
            }
        }
    }
    public boolean isQueenPlace(int n,int row , int col , char[][] ch){
        int temprow=row;
        int tempcol=col;

        while(row>=0 && col>=0){
            if(ch[row][col]=='Q'){
                return true;
            }
            row--;
            col--;
        }

        row=temprow;
        col=tempcol;
        while(row<n && col>=0){
            if(ch[row][col]=='Q'){
                return true;
            }
            row++;
            col--;
        }

        row=temprow;
        col=tempcol;
        while(col>=0){
            if(ch[row][col]=='Q'){
                return true;
            }
            col--;
        }

        return false;

    }
    public static void main(String[] args) {
        N_Queen obj=new N_Queen();
        int n=4;
        System.out.println(obj.checkQueen(n));
    }
}
