

public class LC_14 {
    void longestcommonprefix(){
        String str[] = new String[] {"flower","flow","fly"};
        String prefix="";
        for(int j=0;j<str[0].length();j++){
            char ch=str[0].charAt(j);
            boolean match=true;
            for(int i=1;i<str.length;i++){
                if(j>str[i].length()-1){
                    match=false;
                    break;
                }
                if(ch!=str[i].charAt(j)){
                    match=false;
                    break;
                }
            }
            if(match==true){
                prefix+=ch;
            }else{
                break;
            }
        }
        System.out.println(prefix);    
    }

    public static void main(String[] args) {
        LC_14 obj=new LC_14();
        obj.longestcommonprefix();
    }
    
}
