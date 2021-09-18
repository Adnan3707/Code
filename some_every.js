const movements = [200, 450, -400, 3000, -650, -130, 70, 1300];
// Equality
console.log(movements.includes(-130));
// Conditions
const anyDeposits0 = movements.some((mov) => mov === -130);
const anyDeposits = movements.some((mov) => mov > 5000);
console.log(anyDeposits);
