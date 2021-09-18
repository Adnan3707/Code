const move = [1, 2, 3, 4, 5, 6, 7, -9, 8, 9, -8];
const firstWithdrawal = move.find((move) => move < 0);
console.log(move);
console.log(firstWithdrawal);
const min = [];
var i = 0;
for (const r of move) {
  if (r < 0) {
    min.push(r);
    break;
  }
  i++;
}
console.log(min);
