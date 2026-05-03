import java.util.List;
import java.util.ArrayList;

public class LC_216 { 
    public List<List<Integer>> combination3(int n, int k){
    List<List<Integer>> result=new ArrayList<>();
    List<Integer> list=new ArrayList<>();
    int index=1;
    int count=0;
    checksum(n , k , index , result , list,count);
    return result;
    }
    public void checksum(int n , int k , int index , List<List<Integer>> result, List<Integer> list , int count ){
        if(n==0){
            result.add(new ArrayList<>(list));
            return;
        }
        if(count==k){
            return;
        }
        for(int i=index;i<9;i++){

            if(i > n) break;

            if(list.add(i)) count++;

            checksum(n-i, k, i+1, result, list, count);

            list.remove(list.size()-1);

            count--;

        }
    }
    public static void main(String[] args) {
        LC_216 obj=new LC_216();
        int n=8;
        int k=3;
        System.out.println(obj.combination3(n,k));
    }
}
