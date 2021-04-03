/**
 * @param {string} digits
 * @return {string[]}
 */
var letterCombinations = function (digits) {
  const digitsLength = digits.length;
  const dictionary = {
    2: "abc",
    3: "def",
    4: "ghi",
    5: "jkl",
    6: "mno",
    7: "pqrs",
    8: "tuv",
    9: "wxyz",
  };
  let result = [];
  const dfs = (index, comb) => {
    for (let i = index; i < digitsLength; i++) {
      for (let char of dictionary[digits[i]]) {
        dfs(i + 1, comb + char);
        if ((comb + char).length == digitsLength) result.push(comb + char);
      }
    }
  };
  dfs(0, "");
  return result;
};
console.log(letterCombinations("23"));
