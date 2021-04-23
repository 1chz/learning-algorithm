var findErrorNums = function(nums) {
    
    let res = [];
    let map = new Map();
    let i = 1, m = 0, n = nums.length;
    let sum = n * (n + 1) / 2;
    
    for(let num of nums){
        if(map.get(num) === undefined){
            map.set(num, i);
            m+=num;
        }else{
            res.push(num);
        }
        ++i;
    }

    res.push(sum - m);
    
    return res;

};