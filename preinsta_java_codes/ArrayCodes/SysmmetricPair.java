package preinsta_java_codes.ArrayCodes;
import java.util.*;

public class SysmmetricPair {
    void sysmmetricpair(){
        int arr[][] = new int [][]{{10,20},{30,60},{20,10},{30,30}};
        int result[][];
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr.length;j++){
                if(arr[i][0] == arr[j][1] && arr[i][1] == arr[j][0]){
                    if(result[0]!= arr[i]){
                        System.out.println(Arrays.toString(arr[i]));
                    }
                    result[i] = arr[i][0];
                }
            }
        }
    }
    public static void main(String[] args) {
        SysmmetricPair obj = new SysmmetricPair();
        obj.sysmmetricpair();
    }
    
}
