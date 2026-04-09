public class LC_69 {
    public int findsqrt(int x){
        int low=1;
        int high=x;
        int sqrt=0;
        while(low<=high){
            int mid=low+ (high-low)/2;
            if((long)mid * mid <= x){
                sqrt=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return sqrt;
    }
    public static void main(String[] args) {
        LC_69 obj=new LC_69();
        int x=1;
        System.out.println(obj.findsqrt(x));
    }
}
