class LongestPrefix{
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder s=new StringBuilder();
        char[]ch1=strs[0].toCharArray();
        char[]ch2=strs[strs.length-1].toCharArray();
        for(int i=0;i<ch1.length;i++)
        {
            if(ch1[i]!=ch2[i])
             break;
            else
             s.append(ch1[i]);
        }
        return s.toString();
    }
}
