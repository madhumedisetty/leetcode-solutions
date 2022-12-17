class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        a=collections.Counter(nums1)
        b=collections.Counter(nums2)
        return (a&b).elements()
        