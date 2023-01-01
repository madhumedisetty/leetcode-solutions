class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        lrow,lcol=len(matrix),len(matrix[0])
        top,bot=0,lrow-1
        while(top<=bot):
            row=(top+bot)//2
            if target>matrix[row][-1]:
                top=row+1
            elif target<matrix[row][0]:
                bot=row-1
            else:
                break
        if not (top<=bot):
            return False
        row=(top+bot)//2
        l,r=0,lcol-1
        while(l<=r):
            m=(l+r)//2
            if(target>matrix[row][m]):
                l=m+1
            elif(target<matrix[row][m]):
                r=m-1
            else:
                return True
        return False