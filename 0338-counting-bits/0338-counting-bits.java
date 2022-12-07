class Solution {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        for(int i=0;i<=n;i++){
            ans[i]=count(i);
        }
        return ans;
    }
    int count(int x){
        int c=0;
        while(x!=0) {
            x=x&(x-1);
            c++;
        }
        return c;
    }
    
}