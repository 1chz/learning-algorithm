/*
* Iterative method
*/ 
var isPowerOfTwo = function(n) {
    for(let i=0; i<31; ++i){
       if(2**i === n){
       return true;
       }
    }
     return false;
 };



/*
* Bit method
*/ 
var isPowerOfTwo = function(n) {
    if(n <= 0) return false;
    return ((n&n-1)===0);
};