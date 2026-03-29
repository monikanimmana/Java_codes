public class LC_11{
    public int MaxArea(int arr[]){
        int l=0;
        int r=arr.length-1;
        int max_area =0;
        while(l<r){
            int min_height=Math.min(arr[l],arr[r]);
            int width = r-l;
            int area = min_height * width;
            max_area=Math.max(max_area,area);
            if(arr[l]<arr[r]){
                l++;
            }else{
                r--;
            }
        }
        return max_area;
    }
    public static void main(String[] args) {
        LC_11 obj=new LC_11();
        int arr[] = new int[]{2,3,4,5,18,17,6};
        System.out.println(obj.MaxArea(arr));
    }
}