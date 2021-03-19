const fs = require('fs');
const n = fs.readFileSync('/dev/stdin').toString().split(" ");
console.log(n - 543);