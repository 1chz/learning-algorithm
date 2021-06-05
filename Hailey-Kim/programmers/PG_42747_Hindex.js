function solution(citations) {
    citations.sort((a,b) => b-a)
    
    let lenCit = citations.length;
    let checkH = lenCit, count = checkH;
    
    while (checkH != 0){
        for (let i=0;i<lenCit;i++){
            if(checkH <= citations[i]){
                count -= 1
                if (count === 0){
                    return checkH
                }
            }
            else break;
        }
        checkH -= 1      
        count = checkH
    }  
    return checkH;
}