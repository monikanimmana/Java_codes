

import java.util.HashMap;

public class BinaryLongestSubarray {
    public int BinarySubarry(int arr[],int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int max_length = 0;
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            if(map.get(1) == map.get(0)){
                max_length = (map.get(1) + map.get(0));   
            }

        }
        return max_length;
    }
    public static void main(String[] args) {
        BinaryLongestSubarray obj = new BinaryLongestSubarray();
        int arr[] = new int[]{0,1,0,1,1,0,1};
        int k=0;
        System.out.println(obj.BinarySubarry(arr, k));
    }
}
