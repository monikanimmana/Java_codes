public class LC_125 {
    public boolean isPalindrome(String s) {
    int i=0;
    int j=s.length()-1;
    while(i<j){
        while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
            i++;
        }

        while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
            j--;
        }
        char left = Character.toLowerCase(s.charAt(i));
        char right=Character.toLowerCase(s.charAt(j));

        if(left != right){
            return false;
        }
        i++;
        j--;

    }
    return true;
    }
    public static void main(String[] args) {
        LC_125 obj=new LC_125();
        String s="A man, a plan, a canal: Panama";
        System.out.println(obj.isPalindrome(s));
    }
}
