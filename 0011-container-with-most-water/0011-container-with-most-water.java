class Solution {
    public int maxArea(int[] height) {
        int a=0, l=0;
        int r=height.length-1;
        while(l<r){
            int w;
            if(height[l]>height[r]){
                w= (r-l)*height[r];
                r-=1;
            }
            else{
                w= (r-l)*height[l];
                l+=1;
            }
            if(w>a)
                a=w;
        }
        return a;
    }
}