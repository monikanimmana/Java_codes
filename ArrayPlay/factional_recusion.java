public class factional_recusion {
    public int factorial(int n){
        if (n==1){
            return n;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        factional_recusion obj=new factional_recusion();
        int total= obj.factorial(5);
        System.out.println(total);
    }
}
