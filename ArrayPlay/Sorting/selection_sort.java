import java.util.Arrays;
public class selection_sort{
    public int[] sort(int nums[]){
        int n=nums.length;
        for(int i=0;i<=n-2;i++){
            int mini=i;
            for(int j=i;j<=n-1;j++){
                if(nums[j]<nums[mini]){
                    mini=j;
                }
                int temp=nums[mini];
                nums[mini]=nums[i];
                nums[i]=temp;

            }

        }
        return nums;
    }
    public static void main(String[] args) {
        selection_sort obj=new selection_sort();
        int nums[]=new int[]{13,24,2,56,34,26,1};
        System.out.println(Arrays.toString(obj.sort(nums)));
    }
}