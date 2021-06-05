var canPlaceFlowers = function(flowerbed, n) {

    for(let i=0; i<flowerbed.length && n !== 0; ++i){
        if(flowerbed[i] === 0)
        if(flowerbed[i-1] !== 1 && flowerbed[i+1] !== 1){
            n--;
            flowerbed.splice(i,1,1);
        }
    }
    return n !== 0 ? false : true;
   
    
};