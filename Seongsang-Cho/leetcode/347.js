/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */
var topKFrequent = function(nums, k) {
  let obj = {};
  let result = [];
  nums.forEach((value) => {
    if(!(value in obj)){ obj[value] = 1;}
    else { obj[value] += 1;}
  });
  let objArray = Object.keys(obj).map((key) => [key, obj[key]]);
  objArray = objArray.sort((a,b) => b[1] - a[1]);
  for(let i = 0; i < k; i ++){
    result.push(objArray[i][0]);
  }  
  return result;
};

console.log(topKFrequent([1,2],2));