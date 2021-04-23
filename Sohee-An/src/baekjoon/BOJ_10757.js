let fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().split(' ').map(el=>BigInt(el))

console.log((input[0] + input[1]).toString());