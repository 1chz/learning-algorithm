/**
 * @param {string} jewels
 * @param {string} stones
 * @return {number}
 */
var numJewelsInStones = function (jewels, stones) {
  let jewelsObj = {};
  let result = 0;
  for (let jewel of jewels) {
    if (!jewelsObj.hasOwnProperty(jewel)) {
      jewelsObj[jewel] = 0;
    } else {
      continue;
    }
  }
  stones.split('').forEach((stone, index) =>{
    if (jewelsObj.hasOwnProperty(stone)){
      jewelsObj[stone] += 1;
      result += 1;
    }
  });
  return result
};
console.log(numJewelsInStones("aA", "aAAbbbb"));
