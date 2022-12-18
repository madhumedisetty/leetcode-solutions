class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        a=dict(Counter(nums1))
        b=dict(Counter(nums2))
        a_keys=list(a)
        b_keys=list(b)
        com=[]
        if len(a_keys) >= len(b_keys):
            for i in a_keys:
                if i in b_keys:
                    com+=[i]*min(a[i],b[i])
        else:
            for i in b_keys:
                if i in a_keys:
                    com+=[i]*min(a[i],b[i])
        return com
         
        