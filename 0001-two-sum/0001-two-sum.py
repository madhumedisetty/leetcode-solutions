class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(0,len(nums)):
            temp=nums[i]
            temp2=target-temp
            if temp2 in nums:
                for j in range(i+1,len(nums)):
                    if(nums[j]==temp2):
                        return i,j