package recursion;
import java.util.ArrayList;
import java.util.List;
public class subsequencesum {
    public void sequence(int nums[], int indx, List<Integer> list , int sum,int target){
        if(sum>target){
            return ;
        }
        if(indx==nums.length){
            if(sum==target){
                System.out.println(list);
            }
            return;
        }
        list.add(nums[indx]);
        sum+= nums[indx];

        sequence(nums, indx+1, list, sum, target);

        sum-=nums[indx];
        list.remove(list.size()-1);

        sequence(nums, indx+1, list, sum, target);
       

    }
    public static void main(String[] args) {
        subsequencesum obj=new subsequencesum();
        List<Integer> list=new ArrayList<>();
        int nums[]= new int[]{2,3,5,6 ,1};
        int target=7;
        obj.sequence(nums, 0,list,0,target);
    }
}
