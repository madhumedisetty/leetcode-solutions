class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return(s);
        }
        String o="";
        int s2=2*numRows - 2;
        for(int j=0;j<numRows;j++){
          for(int i=j;i<s.length();i+=s2){
              o+=s.charAt(i);
              if(j>=1 && j<=numRows-2 && i +(s2-2*j) < s.length()){
                  o+=s.charAt(i+s2-2 *j);
              }
          }  
        }
        return(o);
    }
}