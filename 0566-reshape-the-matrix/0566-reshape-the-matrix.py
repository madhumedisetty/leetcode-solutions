class Solution:
    def matrixReshape(self, mat: List[List[int]], r: int, c: int) -> List[List[int]]:
        n=len(mat)*len(mat[0])
        if(n!=r*c):
            return mat
        arr=[]
        for i in range(0,len(mat)):
            for j in range(0,len(mat[0])):
                arr.append(mat[i][j])
        res,k=[],0
        for i in range(0,r):
            l=[]
            for j in range(0,c):
                l.append(arr[k])
                k+=1
            res.append(l)    
        return res