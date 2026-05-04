import java.util.ArrayList;
import java.util.List;
public class LC_77 {
    public List<List<Integer>> combinations(int n , int k){
        List<List<Integer>> result= new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        int index=1;
        checkcombination(n,k,list,result,index);
        return result;
    }
    public void checkcombination(int n,int k, List<Integer> list , List<List<Integer>> result , int index){
        if(list.size()==k){
            result.add(new ArrayList<>(list));
            return;
        }

        for(int i=index;i<=n;i++){

            list.add(i);
            checkcombination(n, k, list, result, i+1);
            list.remove(list.size()-1);
        }
    }
    public static void main(String[] args) {
        LC_77 obj=new LC_77();
        int n=4;
        int k=2;
        System.out.println(obj.combinations(n,k));
    }
}
