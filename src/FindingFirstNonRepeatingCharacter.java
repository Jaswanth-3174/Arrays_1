import java.util.HashMap;

public class FindingFirstNonRepeatingCharacter{
    public static void main(String[] args){
        String s = "leetcode"; // 0, first l is not repeated
        //String s = "hhi"; // 2
        //String s = "aaaaa"; // -1;

        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
        // method 1 using freq array
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }
        for(int i=0; i<s.length(); i++){
            if(freq[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;

        // method 2 : using hashmap
//        int count = 0, index = 0;
//        HashMap<Character, Integer> map = new HashMap<>() ; // Character, Frequency
//        for(int i=0; i<s.length(); i++){
//            char ch = s.charAt(i);
//            map.put(ch, map.getOrDefault(ch, 0)+1);
//        }
//        for(int i=0; i<s.length(); i++){
//            if(map.get(s.charAt(i)) == 1){
//                return i;
//            }
//        }
//        return -1;
    }
}
