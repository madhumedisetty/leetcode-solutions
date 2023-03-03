class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        h,n=len(haystack),len(needle)
        if(n>h):
            return -1
        for i in range(0,h-n+1):
            if haystack[i:i+n] == needle:
                return i
        return -1
    