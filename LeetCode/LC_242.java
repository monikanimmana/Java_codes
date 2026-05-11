
public class LC_242 {
    public boolean validanagram(String str1,String str2){
        // HashMap<Character, Integer> map = new HashMap<>();
        // if(str1.length() != str2.length()){
        //     System.out.println("not valid");
        //     return;
        // }
        // for(int i=0;i<str1.length();i++){
        //     char ch=str1.charAt(i);
        //     if(map.containsKey(ch)){
        //         map.put(ch , map.get(ch)+1);
        //     }
        //     else{
        //         map.put(ch,1);
        //     }   
        // }
        // for(int i=0;i<str2.length();i++){
        //     char ch=str2.charAt(i);
        //     if(map.containsKey(ch)){
        //         map.put(ch , map.get(ch)-1);
        //     }
        //     else{
        //         map.put(ch,1);
        //     }   
        // }
        // for(int nums:map.values()){
        //     if(nums!=0){
        //         System.out.println("not valid anagram");
        //         return;
        //     }
        // }
        // System.out.println("valid");
        int freq[]=new int[26];
        for(int i=0;i<str1.length();i++){
            freq[str1.charAt(i)-'a']++;
            freq[str2.charAt(i)-'a']--;
        }
        for(int count:freq){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        LC_242 obj=new LC_242();
        String str1="rat";
        String str2="cat";
        System.out.println(obj.validanagram(str1,str2));
    }
}

//BRUTE FORCE METHOD
// int count=0;
// if(str1.length()==str2.length()){
//   System.out.println("not a valid anagram");
//  }
// char[] ch1=str1.tocharArray();
// char[] ch2=str2.tocharArray();
// Arrays.sort(ch1);
// Arrays.sort(ch2);
// if(Arrays.equals(ch1,ch2)){
//     System.out.println("valid");
// }else{
//     System.out.println("Not Valid");
// }


            
