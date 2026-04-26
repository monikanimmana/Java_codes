import java.util.ArrayList;
import java.util.List;
public class LC_78 {
    public List<List<Integer>> subset(int [] nums){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        mysubset(nums, 0, list , result);
        return result;        
    }
    public void mysubset(int []nums , int indx , List<Integer> list , List<List<Integer>> result){
        int n=nums.length;
        if(indx==n){
            result.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[indx]);
        mysubset(nums, indx+1, list , result);

        list.remove(list.size()-1);
        mysubset(nums, indx+1, list , result);

    }
    public static void main(String[] args) {
        LC_78 obj=new LC_78();
        int nums[] = new int[]{1,2,3}; 
        System.out.println(obj.subset(nums));
    }
}
