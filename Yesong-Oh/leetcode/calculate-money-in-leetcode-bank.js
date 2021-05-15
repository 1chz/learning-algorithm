var totalMoney = function(n) {
    
    let day = 1, j = 1, res = 0;
    for(let i=1; i<=n; ++i){
        res+=day;
        if(i % 7 === 0){
           day = j;
           j++; 
        }
        day++;
      
    }
     return res; 
  };