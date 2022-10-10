class Solution:
    def isPalindrome(self, x: int) -> bool:
        temp=str(x)
        temp=temp[::-1]
        if(x<0):
            return False
        elif(x==int(temp)):
            return True
        else:
            return False
