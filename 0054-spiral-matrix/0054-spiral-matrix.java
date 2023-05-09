class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> l=new ArrayList<>();
        int top=0, left=0, bottom=matrix.length-1, right=matrix[0].length-1, dir=0, index=0;
        while(top<=bottom&&left<=right){
            if(dir==0){
                for(int i=left;i<=right;i++)
                    l.add((matrix[top][i]));
                top++;
            }
            if(dir==1){
                for(int i=top;i<=bottom;i++)
                    l.add((matrix[i][right]));
                right--;
            }
            if(dir==2){
                for(int i=right;i>=left;i--)
                    l.add((matrix[bottom][i]));
                bottom--;
            }
            if(dir==3){
                for(int i=bottom;i>=top;i--)
                    l.add((matrix[i][left]));
                left++;
            }
            dir=(dir+1)%4;
        }
        return l;
        
    }
}