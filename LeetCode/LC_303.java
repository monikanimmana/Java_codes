import java.util.Arrays;

import DSA_Java.ArrayPlay.prefixSum;

public class LC_303 {
    public int[] Array(int arr[]){
        int n=arr.length;
        int preflix[] = new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            preflix[i]=sum;
        }
        return preflix;
    }
    public int SumRange(int arr[],int left,int right){
        int result=0;
        if(left==0){
            result = arr[right];
        }else{
            result= arr[right] - arr[left-1];
        }
        return result;
    }
    public static void main(String[] args) {
        LC_303 obj = new LC_303();
        int arr[] = new int[]{-2, 0, 3, -5, 2, -1};
        int left=0;int right=2;
        System.out.println(obj.SumRange(obj.Array(arr),left, right));
    }
}
