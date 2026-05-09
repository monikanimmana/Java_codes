
public class square_star {
    public void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        square_star obj=new square_star();
        int n=4;
        obj.pattern(n);
    }
    
}
