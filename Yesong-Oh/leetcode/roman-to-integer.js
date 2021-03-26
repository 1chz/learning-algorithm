var romanToInt = function(s) {
    let res = 0;
    let map = {
        "I" : 1,
        "V" : 5,
        "X" : 10,
        "L" : 50,
        "C" : 100,
        "D" : 500,
        "M" : 1000
        
    };

    
    for(let i=0; i<s.length; ++i){

        if(s[i] === 'I' && (s[i+1] === 'V' || s[i+1] === 'X')){
            res--;
        }else if(s[i] === 'X' && (s[i+1] === 'L' || s[i+1] === 'C')){
            res-=10;
        }else if(s[i] === 'C' && (s[i+1] === 'D' || s[i+1] === 'M')){
            res-=100;
        }else {
            res += map[s[i]];
        }
    }
    

    return res;
     
    
};