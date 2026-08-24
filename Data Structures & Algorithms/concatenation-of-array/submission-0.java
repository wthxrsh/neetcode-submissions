class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length + nums.length];
        int k = 0;
        for(int i = 0;i<arr.length;i++){
            arr[i] = nums[k];
            k++;
            if(k>=nums.length) k=0;
        }
        return arr;
    }
}