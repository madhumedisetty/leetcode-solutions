class Solution:
    def maxArea(self, height: List[int]) -> int:
        a,i,j=0,0,len(height)-1
        while(i<j):
            w= (j-i) * min(height[i],height[j])
            a=max(w,a)
            if(height[i]>height[j]):
                j-=1
            else:
                i+=1
        return a