public class rat_in_maze {
    public void ratmaze_optimal(int [][]maze,int []direct_i,int[] direct_j){
        int n=maze.length;
        int visited[][]=new int[n][n];
        visited[0][0]=1;
        String ans="";
        if(maze[0][0]==1) backtrack(maze,ans, 0, 0, visited, n,direct_i,direct_j);
        System.out.println(ans);
    }
    public void  backtrack(int[][] maze, String ans, int i, int j , int[][] visited,int n,int[] direct_i , int []direct_j){
        if(i==n-1 && j==n-1){
           System.out.println(ans);
           return;
        }
        String value="DLRU";
        for(int index=0;index<4;index++){
            int nexti=i+direct_i[index];
            int nextj=j+direct_j[index];
            if(nexti<n && nextj<n && nexti>=0 && nextj>=0 && visited[nexti][nextj]==0 && maze[nexti][nextj]==1){
                visited[nexti][nextj]=1;
                backtrack(maze, ans+value.charAt(index), nexti,nextj, visited, n,direct_i,direct_j);
                visited[nexti][nextj]=0;
            }

        }
    }
    public static void main(String[] args) {
        rat_in_maze obj=new rat_in_maze();
        int [][]maze=new int[][]{{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
        int []direct_i = new int[]{1,0,0,-1};
        int []direct_j=new int[]{0,-1,1,0};
        obj.ratmaze_optimal(maze,direct_i,direct_j); 
    }
}
