package LeetCode.LeetCodes.Arrays;

import java.util.*;

public class LC_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] merge = new int[m+n];
        for(int i =0;i<m;i++){
            if(nums1[i]!=0){
                merge[i] = nums1[i];

            }
        }
        for(int j=0;j<n ;j++){
            if(nums2[j]!=0){
                merge[j+m] = nums2[j];
            }
        }
        Arrays.sort(merge);
        System.out.println(Arrays.toString(merge));
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LC_88 obj = new LC_88();
        int m = 3;
        int n = 3;
        int []nums1 = new int[]{1,2,3,0,0,0};
        int []nums2 = new int[]{2,5,6 } ;
        obj.merge(nums1,m,nums2,n);
    }

}
    

