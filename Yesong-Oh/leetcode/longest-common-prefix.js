var longestCommonPrefix = function(strs) {
    
    const common = [];
    let maxPrefixLength = strs[0].length;
    for(let i=0; i<strs.length; ++i){
      maxPrefixLength = Math.min(maxPrefixLength, strs[i].length);
    }
 
    for(let i=0; i<maxPrefixLength; ++i){
      let word = strs[0];
      if(strs.every(c => c.indexOf(c[i]) === c.indexOf(word[i])))
      common.push(word[i])
      else break
    }
     return common.length !== 0 ? common.join("") : "";
 };