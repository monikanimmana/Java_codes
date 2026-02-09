package LeetCode.LeetCodes.Arrays;
import java.util.*;

public class LC_66 {
    // public void OnePlus(){
    //     int arr[] = new int[]{1,2,9};
    //     int len = arr.length;
//         int sum = 0;
//         if(len > 0){
//             for(int i=0;i<len;i++){
//                 int val = arr[i];
//                 sum = sum * 10 + val;
//             }
//             int temp = sum % 10;
//             int n = temp + 1;
//             sum = sum % 10;
//             if(n <= 9){
//                 sum = sum * 10 + n;
//             }
//         //     else if (n > 9){
//         //         int div = 1;
//         //         while (div > 1){
//         //             int res = n% 10 ; 
//         //             div = n /10;
//         //             sum = sum * 10 + res;
//         //         }
//         //     }
//         //     System.out.println(sum); 
//         // }
//         // else if(len == 0){
//         //     arr[len] = 1;
//         //     System.out.println(Arrays.toString(arr));
//          }

//     }
//     public static void main(String[] args) {
//         LC_66 obj = new LC_66();
//         obj.OnePlus();
//     }

    
// }
     public void OnePlus(){
        int arr[] = new int []{1,2,5};
        int len = arr.length;
        if(arr[len-1] < 9){
            // int val = arr[len-1] + 1;
            // arr[len-1] = val;
            arr[len-1] ++;
            System.out.println(Arrays.toString(arr));
        
        }

     }
     public static void main(String[] args) {
        LC_66 obj = new LC_66();
        obj.OnePlus();
     }

    }
