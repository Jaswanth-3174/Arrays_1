public class ValidAnagram {
    public static void main(String[] args) {
        String s = "god";
        String t = "dogg";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        int[] freq = new int[26];
        for(int i = 0; i<s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }
        for(int i=0; i<t.length(); i++){
            freq[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i<26; i++){
            if(freq[i]!=0) return false;
        }
        return true;
    }
}
