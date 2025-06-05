class ValidAnagram{
    public boolean isAnagram(String s, String t) {
        char[]ch1=s.toCharArray();
        char[]ch2=t.toCharArray();
        int i,j,cnt=0;
        for(i=0;i<ch1.length;i++)
        {
            for(j=0;j<ch2.length;j++)
            {
                if(ch1[i]==ch2[j])
                {
                    ch2[j]='*';
                    cnt++;
                    break;
                }
            }
        }
        int max=Math.max(ch1.length,ch2.length);
        if(max==cnt)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
