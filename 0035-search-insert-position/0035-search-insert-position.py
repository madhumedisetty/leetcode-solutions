class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        n,l=len(nums),0
        r=n-1
        if(n == 0):
            return 0
        while(l < r):
            m = l + (r - l)//2
            if(nums[m] == target):
                return m
            elif(nums[m] > target):
                r = m 
            else:
                l = m + 1
        if(nums[l] < target):
            return l+1
        else:
            return l