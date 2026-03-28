import java.util.Arrays;

public class LC_238 {
    public int[] productExceptSelf(int arr[]){
        int n=arr.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        int result[] = new int[n];
        prefix[0]=1;
        suffix[n-1]=1;
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]*arr[i-1];
        } 
        for(int j=n-2;j>=0;j--){
            suffix[j]=suffix[j+1]*arr[j+1];
        }
        for(int k=0;k<n;k++){
             result[k]=prefix[k]*suffix[k];
        } 
        return result;
    }
    public static void main(String[] args) {
        LC_238 obj=new LC_238();
        int arr[] = new int[]{1,2,3,4};
        System.out.println(Arrays.toString(obj.productExceptSelf(arr)));
    }
}
