var judgeCircle = function(moves) {
    
    let [x, y] = [0,0];
    for(let move of moves){
        if(move === "U"){
            x++;
        }else if(move === "D"){
            x--;
        }else if(move === "R"){
            y++;
        }else{
            y--;
        }
    }
    
    return x === 0 && y === 0 ? true : false; 
   
};