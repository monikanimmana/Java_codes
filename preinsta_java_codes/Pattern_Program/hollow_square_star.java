

public class hollow_square_star {
    public void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i==0 || i==(n-1))||(j==0 ||j==(n-1))){
                    System.out.print("*");
                }else{
                System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow_square_star obj=new hollow_square_star();
        int n=4;
        obj.pattern(n);
    }
}
