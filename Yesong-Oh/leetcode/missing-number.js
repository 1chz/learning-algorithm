var missingNumber = function(nums) {
    const n = nums.length;
    return n*(n+1)/2 - nums.reduce((a, c) => a + c);
};