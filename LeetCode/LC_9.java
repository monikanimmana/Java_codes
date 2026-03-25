public class LC_9 {
    public boolean PalindromNumber(int n){
        int temp = n;
        int rev=0;
        if(temp < 0){
            return false;
        }else{
            while(temp !=0){
                int val = temp % 10;
                rev = rev * 10 + val;
                temp /=  10;
            }
        }
        return rev==n;
        
    }
    public static void main(String[] args) {
        LC_9 obj = new LC_9();
        int n = 121;
        System.out.println(obj.PalindromNumber(n));
    }
}
