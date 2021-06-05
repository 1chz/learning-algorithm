var canJump = function(nums) {
    let max = 0;
    for(let i=0; i<nums.length; ++i){
        if(max<i) return false;
        max = Math.max(max, i+nums[i]);
    }
    return true;
};