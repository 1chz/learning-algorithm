var maxProfit = function(prices) {

    let [left, right] = [0, 1];
    let res = 0;
    
    if(prices.length < 2) return 0;
    while(right <= prices.length-1){
        res = Math.max(res, prices[right] - prices[left]);
        if(prices[left] > prices[right]){
            left = right;
        }
        right++;
    }
    return res;
   
};