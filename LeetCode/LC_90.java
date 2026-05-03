import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class LC_90 {
    public List<List<Integer>> subsetWithDup(int []nums){
        int index=0;
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        checksubset(nums , index , list, result);
        return result;
    }
    public void checksubset(int []nums , int index , List<Integer> list , List<List<Integer>> result ){
        result.add(new ArrayList<>(list));
        for(int i=index;i<nums.length;i++){
            if(i>index&&nums[i]==nums[i-1]) continue;

            list.add(nums[i]);
            checksubset(nums, i+1, list, result);
            list.remove(list.size()-1);
            
        }
    }
    public static void main(String[] args) {
        LC_90 obj=new LC_90();
        int nums[]=new int[]{1,2,2};
        System.out.println(obj.subsetWithDup(nums));
    }
}
