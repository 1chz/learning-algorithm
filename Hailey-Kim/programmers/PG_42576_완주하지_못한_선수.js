function solution(participant, completion) {
    var i;
    const lastIndex = completion.length;
    
    participant.sort();
    completion.sort();
    
    for (i=0; i<lastIndex;i++){
       if (participant[i]!= completion[i]){
           return participant[i];
       }
    }
    return participant[lastIndex];
}