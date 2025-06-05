class Duplicate{
    public boolean containsDuplicate(int[] nums) {
       HashMap<Integer,Integer>h=new HashMap<>();
       int f=0;
       for(int n:nums)
       {
        if(h.containsKey(n))
        {
            f=1;
            break;
        }
        else
        {
            h.put(n,1);
        }
       }
       if(f==1)
       {
        return true;
       }
       else
       {
        return false;
       }
    }
}
