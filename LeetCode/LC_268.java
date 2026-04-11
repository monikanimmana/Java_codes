public class LC_268 {
    public int MissingNumber(int arr[]){
        int original_sum=0;
        int n=arr.length;
        for(int i:arr){
            original_sum+=i;
        }
        int excepted_sum = (n*(n+1))/2;
        return excepted_sum-original_sum;
    }
    public static void main(String[] args) {
        LC_268 obj=new LC_268();
        int arr[]=new int[]{3,0,1};
        System.out.println(obj.MissingNumber(arr));
    }
    
}
