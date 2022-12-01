class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        int len = s.length()-1;
        StringBuilder ans = new StringBuilder();
        StringBuilder tmp = new StringBuilder();
        int i = 0;
        while(i<=len){
            if(s.charAt(i)==' '){
                tmp.reverse();
                ans.append(tmp).append(" ");
                tmp=new StringBuilder();
                while(i<=len && s.charAt(i)==' ') i++;
            }else{
                tmp.append(s.charAt(i)); 
                i++;
            }
        }
        tmp.reverse();
        ans.append(tmp);
        return ans.toString();
    }
}