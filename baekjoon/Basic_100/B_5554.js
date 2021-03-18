// 백준 5554 심부름 가는 길

function time(input) {
  let sum = 0;
  for(let i=0; i<input.length; i++) {
    sum += input[i];
  }

  const min = Math.floor(sum / 60);
  const sec = sum % 60

  console.log(min);
  console.log(sec);
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
  if(i == 4) {
    rl.close();
  }
}).on('close', function() {
  time(input);
  process.exit();
});