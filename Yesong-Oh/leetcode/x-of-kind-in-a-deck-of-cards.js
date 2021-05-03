var hasGroupsSizeX = function(deck) {
    
    if(deck.length === 1){
        return false;
    }
   
     let count = {};
     let max = 0;
     for(let card of deck){
         count[card] ? count[card]++ : count[card] = true;
         max = Math.max(max, count[card]);
     }
 
      let cnt = Object.values(count); 
      for(let i=2; i<=max; ++i){
        if(cnt.every(count => count % i === 0 )){
            return true;
        }
      }
     return false;
   
 };