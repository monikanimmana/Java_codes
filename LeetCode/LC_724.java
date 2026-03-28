public class LC_724{
    public int PivotIndex(int arr[]){
        int rightsum=0;
        int leftsum=0;
        for(int x:arr){
            rightsum+=x;
        }
        for(int i=0;i<arr.length;i++){
            rightsum-=arr[i];
            if(rightsum == leftsum){
                return i;
            }
            leftsum+=arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        LC_724 obj=new LC_724();
        int arr[] = new int[]{2,1,-1};
        System.out.println(obj.PivotIndex(arr));

    }

}