package DSA_Java.ArrayPlay;

public class findtargetvalue {
    public int findvalue(int arr[],int target){
        int j= arr.length-1;
        int i=0;
        while(i<j){
            int result = arr[i]+arr[j];
            if(result == target){
                System.out.println(i + " " + j);
                return 1;

            }
            else{
                if(result>target){
                    j--;
                }else{
                    i++;
                }
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        findtargetvalue obj=new findtargetvalue();
        int arr[] = new int[]{1,2,3,4,6};
        int target = 5;
        System.out.println(obj.findvalue(arr,target));
    }
}
