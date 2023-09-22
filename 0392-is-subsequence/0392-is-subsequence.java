class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        for(char ch : t.toCharArray()){
            if(i>=s.length()) break;
            if(ch == s.charAt(i)){
                ++i;
            }
            
        }
        System.out.println("i: "+i);
        return i==s.length();
    }
}