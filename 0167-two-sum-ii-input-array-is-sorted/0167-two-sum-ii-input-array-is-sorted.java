class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr=new int[2];
        int left=0,right=numbers.length-1;
        while(left<right){
            if(numbers[left]+numbers[right]>target){
                right-=1;
            }
            else if(numbers[left]+numbers[right]<target){
                left+=1;
            }
            else
               break;
        }
        arr[0]=left+1;
        arr[1]=right+1;
        return arr;
    }
}