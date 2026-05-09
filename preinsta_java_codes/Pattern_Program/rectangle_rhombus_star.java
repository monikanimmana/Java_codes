public class rectangle_rhombus_star {
    public void pattern(int row,int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<col;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        rectangle_rhombus_star obj=new rectangle_rhombus_star();
        int row=4;
        int col=6;
        obj.pattern(row,col);
    }
    
}


