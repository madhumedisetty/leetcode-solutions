class Solution {
    public void reverse(int[] nums, int s, int e){
        while(s<=e){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
    }
    public void rotate(int[] nums, int k) {
        int l=nums.length;
        k%=l;
        reverse(nums, 0, l-1);
        reverse(nums, 0,k-1);
        reverse(nums, k, l-1); 
        
    }
}