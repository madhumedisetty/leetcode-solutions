class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        nonzerop,zerop,zeroc=1,1,0
        for j in nums:
            if j==0:
                zerop=0
                zeroc+=1
                continue
            nonzerop*=j
        l=[]
        for i in range(len(nums)):
            if zeroc>1:
                    l.append(0)
            elif zerop==0: 
                if nums[i]==0:
                    l.append(nonzerop)
                else:
                    l.append(0)
            else:
                l.append(nonzerop//nums[i])
            
        return l
