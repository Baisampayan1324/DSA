class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i = 0;i<n;i++){
            for (int j = i+1;j<n;j++){
                if(nums[i] + nums[j] == target){
                    int[] result = new int[2];
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return new int[0];
    }
}