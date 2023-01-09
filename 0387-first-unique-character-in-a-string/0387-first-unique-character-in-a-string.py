
class Solution(object):
    def firstUniqChar(self, s):
        """
        :type s: str
        :rtype: int
        """
        ss = collections.Counter(s);
        
        for i in range(len(s)):
            if ss[s[i]] == 1:
                return i
        return -1   
                