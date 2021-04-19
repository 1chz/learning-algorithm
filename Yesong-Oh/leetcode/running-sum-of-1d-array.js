var runningSum = function(nums) {
    let sum = 0;
    let res = nums.map((val, idx) => sum += val);
    
    return res;
};