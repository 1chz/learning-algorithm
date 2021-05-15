var isSubsequence = function(s, t) {
    for(let word of t){
        if(s.charAt(0) === word){
            s = s.slice(1);
        }
    }
 return s.length === 0;
 
 };