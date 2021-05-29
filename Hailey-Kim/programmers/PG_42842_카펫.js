// Carpet Size
// Each side of the carpet is colored brown, and the remaining center is colored yellow.
// When the nums of brown and yellow blocks are given,
// return the size of the carpet.

// 01/21/21

// programmers.co.kr

function solution(brown, yellow) {
    
    // brown = 2(w+h) - 4
    // yellow = w*h - brown
    // 2 <= h  <= sqrt(brown + yellow)
    
    const cap = Math.sqrt(brown + yellow)
    const answer = []
    for (let h=2; h<=cap;h++){
        let w = (yellow + brown) / h
        console.log(w)
        let w2 = (brown+4)/2 - h
        if (w ===w2  && Number.isInteger(w)){
            answer.push(w, h)
            break
        }
    
    }
    
    return answer
}