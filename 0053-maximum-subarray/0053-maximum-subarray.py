import sys
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        n=len(nums)
        maxsum=nums[0]
        cursum=0
        for i in nums:
            if cursum<0:
                cursum=0
            cursum+=i
            maxsum=max(maxsum,cursum)
        return maxsum

