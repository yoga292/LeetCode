class RevWords{
    public String reverseWords(String s) {
        s=s.trim();
        int k=0;
        String[]str=s.split("\\s+");
        String[]r=new String[str.length];
        for(int i=str.length-1;i>=0;i--)
        {
            r[k++]=str[i];
        }
        return String.join(" ",r);
        
    }
}
