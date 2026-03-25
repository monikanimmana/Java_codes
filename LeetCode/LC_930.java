
import java.util.HashMap;

public class LC_930 {
    public int Binarysubarray(int arr[] , int goal){
        HashMap<Integer , Integer> map=new HashMap<>();
        int sum=0;
        int count=0;
        int n = arr.length;
        map.put(0,1); 
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(map.containsKey(sum - goal)){
                count += map.get(sum - goal);
            }
            map.put(sum , map.getOrDefault(sum, 0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        LC_930 obj = new LC_930();
        int arr[] =  new int[]{0,1,0,1,0};
        int goal=2;
        System.out.println(obj.Binarysubarray(arr, goal));
    }
}
