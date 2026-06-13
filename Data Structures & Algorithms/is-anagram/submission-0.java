class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];

        char[] Sarr = s.toCharArray();
        char[] Tarr = t.toCharArray();

        for(char c:Sarr){
            freq[c-'a']++;
        }

        for(char c:Tarr){
            freq[c-'a']--;
        }

        for(int n:freq){
            if(n!=0){
                return false;
            }
        }
        return true;
    }
}
