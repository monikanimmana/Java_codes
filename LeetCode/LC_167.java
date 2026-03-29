import java.util.Arrays;

public class LC_167 {
    public int[] twoSum(int[] numbers, int target) {
        int result=0;
        int j=numbers.length-1;
        int i=0;
        while(i<j){
            result=numbers[i]+numbers[j];
            if(result==target){
                return new int[]{i+1,j+1};
            }else{
                if(result>target){
                    j--;
                }else{
                    i++;
                }
            }

        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        LC_167 obj=new LC_167();
        int arr[] = new int[]{2,7,12,13};
        int target=9;
        System.out.println(Arrays.toString(obj.twoSum(arr, target)));
    }
}
