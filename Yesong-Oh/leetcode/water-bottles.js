var numWaterBottles = function(numBottles, numExchange) {
    let fullBottles = numBottles;
    let drink = 0, bottles = 0;
    while(numBottles > 1){
        if(numExchange - numBottles > 0) break;
        numBottles -= numExchange;
        drink++; bottles++;
        
        if(numBottles < numExchange){
            numBottles += drink;
            drink = 0;
        }
    }
    return fullBottles + bottles;
};