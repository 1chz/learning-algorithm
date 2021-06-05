var titleToNumber = function(columnTitle) {
    
    const col = {};
    const len = columnTitle.length;
    for(let i=0; i<26; ++i){
        let str = String.fromCharCode(65 + i);
        col[str] = i+1; 
    }
   
    if(len === 1) return col[columnTitle[0]];
    
    let res = (col[columnTitle[0]] * 26);
    for(let i=1; i<len-1; ++i){ 
      let next = col[columnTitle[i]];
      res += next;
      res *= 26;
    }
   return res+col[columnTitle[len-1]];
    
    
    
};