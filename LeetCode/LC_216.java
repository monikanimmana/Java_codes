import java.util.List;
import java.util.ArrayList;

public class LC_216 { 
    public List<List<Integer>> combination3(int n, int k){
    List<List<Integer>> result=new ArrayList<>();
    List<Integer> list=new ArrayList<>();
    int index=1;
    checksum(n , k , index , result , list);
    return result;
    }
    public void checksum(int n , int k , int index , List<List<Integer>> result, List<Integer> list){
        if(n==0 && list.size()==k){
            result.add(new ArrayList<>(list));
            return;
        }

        if(n<0 || list.size() > k) return;

        for(int i=index;i<=n;i++){

            if(i > n ) break;

            list.add(i);
            checksum(n-i, k, i+1, result, list);
            list.remove(list.size()-1);
                
        } 
    }
    
    public static void main(String[] args) {
        LC_216 obj=new LC_216();
        int n=9;
        int k=3;
        System.out.println(obj.combination3(n,k));
    }
}
