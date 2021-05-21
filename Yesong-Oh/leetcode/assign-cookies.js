var findContentChildren = function(g, s) {
    let cnt = 0, i = 0;
    g.sort((a,b) => a - b);
    s.sort((a,b) => a - b);
    for(let c of s){
        if(c >= g[i]){
            ++cnt;
            ++i;
        }
    }
    return cnt;
    
};