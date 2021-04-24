var lastStoneWeight = function(stones) {
    
    while(stones.length > 1){   
     stones.sort((a, b) => {return a -b});   
     let x = stones[stones.length-1];
     let y = stones[stones.length-2];

     stones.splice(stones.indexOf(x), 2);
     if(x !== y){        
     stones.splice(stones.indexOf(x), 2, Math.abs(y-x));
     }
   }
   
    return stones[0] || 0;
    
};