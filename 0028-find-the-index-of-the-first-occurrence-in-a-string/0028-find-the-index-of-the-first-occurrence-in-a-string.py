class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        h=len(haystack)
        n=len(needle)
        if(n>h):
            return -1
        else:
            for i in range(0,h-n+1):
                j=0
                k=i
                while(j<n):
                    if(needle[j]==haystack[k]):
                        print(needle[j],haystack[k])
                        k+=1
                        j+=1
                        continue
                    else:
                        break
                if(j==n):
                    return i
        return -1
                
        