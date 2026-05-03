import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class LC_40 {
    public List<List<Integer>> combination2(int candidate[], int target){
        Arrays.sort(candidate);
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        int index=0;
        checksum(candidate,target,index,list,result);
        return result;
    }
    public void checksum(int candidate[], int target , int index , List<Integer> list , List<List<Integer>> result){
        if(target == 0){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<candidate.length;i++){

            if(i>index && candidate[i]==candidate[i-1]) continue;

            if(target < candidate[i]) break;

            list.add(candidate[i]);
            checksum(candidate, target-candidate[i], i+1, list, result);
            list.remove(list.size()-1);
        }
    }
    public static void main(String[] args) {
        LC_40 obj=new LC_40();
        int candidate[] = new int[]{10,1,2,7,6,1,5};
        int target=8;
        System.out.println(obj.combination2(candidate,target));
    }
}
