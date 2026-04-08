public class binarysearch{
    public int findmin(int num){
        int low=0;
        int high=num;
        int val=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(mid * mid >= num){
                val = mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return val;
    }
    public static void main(String[] args) {
        binarysearch obj=new binarysearch();
        int num=20;
        System.out.println(obj.findmin(num));
    }
}