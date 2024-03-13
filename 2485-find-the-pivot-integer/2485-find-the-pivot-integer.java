class Solution {
     public int pivotInteger(int n) {
        if(n==1) return 1;
        int sumx = 0;
        int sumn =0;
        int x =1;
        
        while(x<=n)
        {
         sumx = x*(x+1)/2;
         sumn = n*(n+1)/2-sumx+x;
         if(sumx==sumn) return x;
            x++;
        // System.out.println(sumx);   
        // System.out.println(sumn);
        }
        return -1;
    }
}