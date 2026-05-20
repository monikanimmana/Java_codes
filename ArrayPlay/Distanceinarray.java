public class Distanceinarray {
    public int find(int arr[]){
        int dist=1;;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>0 && arr[j]>0){
                    dist=Math.min(dist,(j-i));
                }
            }    
        }
        return dist;
    }
    public static void main(String[] args) {
        Distanceinarray obj=new Distanceinarray();
        int arr[]=new int[]{-1,-3,-1,-2,-1,-3};
        System.out.println(obj.find(arr));
    }
}
