class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int l=0, r=matrix[0].length-1;
        int t=0, b=matrix.length-1;
        List<Integer> li=new ArrayList<>();
        while(l<=r && t<=b){
            for(int i=l;i<=r;i++)
                li.add(matrix[t][i]);
            t+=1;
            for(int j=t;j<=b;j++)
                li.add(matrix[j][r]);
            r-=1;
            if(t<=b){
                for(int i=r;i>=l;i--)
                    li.add(matrix[b][i]);
                b-=1;
            }
            if(l<=r){
                for(int j=b;j>=t;j--)
                    li.add(matrix[j][l]);
                l+=1;
            }
                 
        }
        return(li);
    }
}