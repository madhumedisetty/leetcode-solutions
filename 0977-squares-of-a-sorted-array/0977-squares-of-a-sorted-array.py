class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        i,j=0,len(nums)-1
        temp=nums.copy()
        for k in range(len(nums)-1,-1,-1):
            if(abs(nums[i])>abs(nums[j])):
                temp[k]=(nums[i]**2)
                i+=1
            else:
                temp[k]=(nums[j]**2)
                j-=1
        return temp