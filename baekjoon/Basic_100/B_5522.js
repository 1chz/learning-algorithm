// 백준 5522 카드게임

function sum(input) {
  let sum = 0;
  for(let i=0; i<input.length; i++) {
    sum += input[i];
  }
  console.log(sum);
}

const readline = require("readline");

const rl = readline.createInterface({
  input : process.stdin,
  output : process.stdout
});

let i = 0;
let input = [];

rl.on('line', function(line) {
  i++;
  input.push(parseInt(line));
  if(i == 5) {
    rl.close();
  }
}).on('close', function() {
  sum(input);
  process.exit();
});