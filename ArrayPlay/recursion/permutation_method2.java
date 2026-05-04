import java.util.ArrayList;
import java.util.List;
public class permutation_method2 {
    public List<List<Integer>> method2(int nums[]){
        List<List<Integer>> result=new ArrayList<>();
        int index=0;
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

            swap(i,index,nums);
            backtrack(nums, i+1, result);
            swap(i,index,nums);

        }        
    }
    public void swap(int i , int index, int nums[]){
        int temp=nums[i];
        nums[i]=nums[index];
        nums[index]=temp;
    }
    public static void main(String[] args) {
        permutation_method2 obj=new permutation_method2();
        int nums[]=new int[]{1,2,3};
        System.out.println(obj.method2(nums));
    }
}
