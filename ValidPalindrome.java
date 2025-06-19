class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        char[]ch=s.toCharArray();
        String res="";
        for(int i=ch.length-1;i>=0;i--)
        {
            res+=ch[i];
        }
        return s.equals(res);
    }
}
