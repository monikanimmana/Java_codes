import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class permutation_method2_duplicates {
    public List<List<Integer>> duplicates(int nums[]){
        List<List<Integer>> result=new ArrayList<>();
        int index=0;
        Arrays.sort(nums);
        backtrack(nums , index , result);
        return result;

    }
    public void backtrack(int nums[] , int index , List<List<Integer>> result){
        if(index==nums.length){
            List<Integer> list=new ArrayList<>();
            for(int num : nums) list.add(num);
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<nums.length;i++){

            if(i>index && nums[i]==nums[i-1]) continue;

            swap(i,index,nums);
            backtrack(nums, index+1, result);
            swap(i,index,nums);

        }        
    }
    public void swap(int i , int index, int nums[]){
        int temp=nums[i];
        nums[i]=nums[index];
        nums[index]=temp;
    }
    public static void main(String[] args) {
        permutation_method2_duplicates obj=new permutation_method2_duplicates();
        int nums[]=new int[]{1,1,2};
        System.out.println(obj.duplicates(nums));
    }
}

