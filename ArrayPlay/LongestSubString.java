package DSA_Java.ArrayPlay;

import java.util.HashMap;

public class LongestSubString {
    public int NonRepeatSubString(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        int left=0;
        int max_substring = 0;
        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);
            map.put(ch , map.getOrDefault(ch, 0)+1);
            while(map.get(ch)>1){
                map.put(s.charAt(left), map.get(s.charAt(left))-1);
                left++;
            }
            max_substring = Math.max(max_substring , right-left+1);
        }
        System.out.println(max_substring);
        return 0;
    }
    public static void main(String[] args) {
        LongestSubString obj = new LongestSubString();
        String s="abcabcc";
        obj.NonRepeatSubString(s);
    }
}
