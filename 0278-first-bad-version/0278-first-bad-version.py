# The isBadVersion API is already defined for you.
# def isBadVersion(version: int) -> bool:

class Solution:
    def firstBadVersion(self, n: int) -> int:
        l,h=0,n
        while (h-l)>1:
            m=l+(h-l)//2
            if isBadVersion(m):
                h=m
            else:
                l=m
        return h
            