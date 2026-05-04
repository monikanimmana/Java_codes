import java.util.ArrayList;
import java.util.List;
public class permutations {
    public List<List<Integer>> permutate(int nums[]){
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        boolean used[] = new boolean[nums.length];
        findpermutate(nums, used , list , result);
        return result;
    }
    public void findpermutate(int nums[], boolean used[] , List<Integer> list , List<List<Integer>> result){
        if(list.size() == nums.length){
            result.add(new ArrayList<>(list));
            return;
        }

        for(int i=0;i<nums.length;i++){

            if(used[i]) continue;

            list.add(nums[i]);
            used[i]=true;
            findpermutate(nums, used, list, result);
            used[i]=false;
            list.remove(list.size()-1);
            
        }
    }
    public static void main(String[] args) {
        permutations obj=new permutations();
        int nums[]=new int[]{1,2,3};
        System.out.println(obj.permutate(nums));
    }
    
}
