var isHappy = function(n, cnt = 0) {

    if(cnt === 7) return false;
    let number = String(n);
    let res  = 0;
    for(let num of number){
        res += (+num)*(+num);
    }
        
     if(n !== 1) return isHappy(res, cnt+1);
     return res;
    
};