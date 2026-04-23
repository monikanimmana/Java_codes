public class reverse_array {
    public void array(int i,int n , int arr[]){
        if(i>n){
            return;
        }
        array(i+1,n,arr);
        System.out.println(arr[i]);
    }
    public static void main(String[] args) {
        reverse_array obj=new reverse_array();
        int arr[]=new int[]{1,2,3,4,5};
        obj.array(0, arr.length-1, arr);

    }
}
