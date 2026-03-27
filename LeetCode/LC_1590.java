import java.util.HashMap;

public class LC_1590 {
   public int minSubarray(int arr[], int p){
    HashMap<Integer,Integer> map=new HashMap<>();
    int length=0;
    int min_length=arr.length;
    int sum=0;
    for(int i:arr){
        sum+=i;
    }
    map.put(0,-1);
    int k = sum%p;
    if(k==0){
            return 0;
    }else{
        for(int i=0;i<arr.length;i++){
            sum=(sum+arr[i])%p;
            int target = (sum-k+p)%p;
            if(map.containsKey(target)){
                length=i-map.get(target);
                min_length=Math.min(min_length,length);
            }
                map.put(sum,i);
        }
        if(min_length>0){
            return min_length;
        }else{
            return -1;
        }  
            
        }
    }
   public static void main(String[] args) {
    LC_1590 obj=new LC_1590();
    int arr[] = new int[]{6,3,5,2};
    int p=9;
    System.out.println(obj.minSubarray(arr, p));

    } 
}
