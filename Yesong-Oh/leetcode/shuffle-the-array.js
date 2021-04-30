var shuffle = function(nums, n) {

    let res = [];
    let nums2 = nums.slice(n, nums.length);
    for(let i=0; i<n; ++i){
        res.push(nums[i], nums2[i]);
    }
    return res;
};