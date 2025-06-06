class ReverseInteger{
    public int reverse(int x) {
        int f=0;
        if(x<0)
        {
            x=Math.abs(x);
            f=1;
        }
        int rem,rev=0;
        while(x!=0)
        {
            rem=x%10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && rem > 7)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && rem < -8)) return 0;
            rev=rev*10+rem;
            x=x/10;
        }
        if(f==1)
          return -rev;
        else
          return rev;
    }
}
