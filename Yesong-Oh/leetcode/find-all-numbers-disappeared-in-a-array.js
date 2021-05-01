var findDisappearedNumbers = function(nums) {
   
    let res = [];
    let hash = new Map();
    nums.map((val, idx) => {
        hash.set(val, idx);
    })
    
    for(let i=1; i<=nums.length; ++i){
        if(!hash.has(i)){
            res.push(i);
        }
    }
    return res;
};