import java.util.HashSet;

public class day4_LongestSubstringWithoutRepeatingChar {
    static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int i = 0; 
        int j = 0;
        while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                max = Math.max(max,set.size());
            }else{
                set.remove(s.charAt(i++));
            }
        }
        return max;
        }
    public static void main(String[] args){
        String str = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(str));
    }
}
