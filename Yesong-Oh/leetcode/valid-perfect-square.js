var isPerfectSquare = function(num) {
    
    const MAX_VALUE = 2147483647;
    let i = 1;
    while(i*i <= MAX_VALUE){
      if(num === i*i){
          return true;
      }
        ++i;
    }
      return false;
  };