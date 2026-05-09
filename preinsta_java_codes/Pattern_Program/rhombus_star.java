public class rhombus_star {
    public void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        rhombus_star obj=new rhombus_star();
        int n=4;
        obj.pattern(n);
    }
    
}
