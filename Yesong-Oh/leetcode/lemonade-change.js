var lemonadeChange = function(bills) {
    
    let f = 0, t = 0;
    for(let b of bills){
        if(b === 5){
            f+=5
        }else if(b === 10){
            if(f < 5) return false;
            t+=10;
            f-=5;
        }else if(b === 20){
            if(f === 0 || f < 15 && t === 0) return false;
            
            if(t === 0){
                f-=15
            }else{
                t-=10;
                f-=5;
            }
          }
        }
      return true;
    };