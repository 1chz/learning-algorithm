var reverseOnlyLetters = function(S) {

    let reg2 = /^[\x21-\x40\x5B-\x60]*$/
    let res = [...S].filter((ele) => !reg2.test(ele)).reverse();
    for(let i in S){
    if(reg2.test(S[i])){
        res.splice(i, 0, S[i]);
        }
    }
    
    return res.join("");
    
       
    };