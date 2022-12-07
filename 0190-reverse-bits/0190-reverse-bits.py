class Solution:
    def reverseBits(self, n: int) -> int:
        x=0
        for i in range(32):
            bit = (n>>i) & 1
            x= x | (bit << (31-i))
        return x
            
        
          
        