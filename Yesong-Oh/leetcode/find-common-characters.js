var commonChars = function(A) {
    let startChar = A[0].split("");
    let res = [];
    
    for(let i in startChar){
        if(A.every(word => word.includes(startChar[i]))){
           res.push(str[i]);
           A = A.map(word => word.replace(startChar[i], ""))
        }
    }
    
   return res;
};