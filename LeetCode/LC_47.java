import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_47 {
    public List<List<Integer>> duplicates(int nums[]){
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        boolean used[]=new boolean[nums.length];
        backtrack(nums ,result,used,list);
        return result;

    }
    public void backtrack(int nums[],List<List<Integer>> result ,boolean []used,List<Integer> list){
        if(list.size() ==nums.length){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;

            if(i>0 && nums[i]==nums[i-1] && !used[i-1]) continue;

            used[i]=true;
            list.add(nums[i]);
            backtrack(nums,result,used,list);
            list.remove(list.size()-1);
            used[i]=false;

        }        
    }
    public static void main(String[] args) {
        LC_47 obj=new LC_47();
        int nums[]=new int[]{1,2,3};
        System.out.println(obj.duplicates(nums));
    }
}
