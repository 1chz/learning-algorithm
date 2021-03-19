const fs = require('fs');
const [prev, next] = fs.readFileSync('/dev/stdin').toString().split(" ");
console.log(Math.abs(prev - next));