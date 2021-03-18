// 백준 18108 1998년생인 내가 태국에서는 2541년생?!

function year(y) {
  let result = y - 544;
  console.log(result);
}

const readline = require("readline");

const rl = readline.createInterface({
  input : process.stdin,
  output : process.stdout
});

rl.on('line', function(line) {
  let y = parseInt(line);
  year(y);
  rl.close();
}).on('close', function() {
  process.exit();
});