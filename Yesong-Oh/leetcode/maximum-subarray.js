var maxSubArray = function(nums) {
    
    if(nums.length === 1) return nums[0];
    let maximumNum = -2147483647;
    for(let i=0; i<nums.length; ++i){
        let sum = 0;
        for(let j=i; j<nums.length; ++j){
            sum += nums[j];
            maximumNum = Math.max(maximumNum, sum);
        }
    }
    return maximumNum;
};

