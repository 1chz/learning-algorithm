var firstUniqChar = function(s) {

    let tmp = s;
    let findDuplicates = arr => [...new Set([...s].filter((item, index) =>
    arr.indexOf(item) != index))];
    
    var expStr = new RegExp(findDuplicates([...s]).join("|"), "gi");
    tmp = tmp.replace(expStr, ""); 
    
    return (tmp.length > 0 ? s.indexOf(tmp[0]) : -1); 
   
};