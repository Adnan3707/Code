const movements = [200, 450, -450, 3000, -650, -130, 70, 1300];
const eurToUsd = 1.1;
/*
const movementsUSD = movements.map(function (mov) {
  return mov * eurToUsd;
});
*/ // Can be written as
const movementsUSD = movements.map((mov) => mov * eurToUsd);
console.log(movementsUSD);
console.log("Another Function");
const movementsUSDfor = [];
for (const mov of movements) movementsUSDfor.push(mov * eurToUsd);
console.log(movementsUSDfor);

const movementsDescripitions = movements.map((mov, i) => {
  if (mov > 0) {
    return `Movements ${i + 1} : You deposited ${mov}`;
  } else {
    return `Movements : ${i + 1}: You withdrew ${Math.abs(mov)}`;
  }
});
console.log(movementsDescripitions);
