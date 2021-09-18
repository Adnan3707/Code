const movements = [200, 450, -400, 3000, -650, -130, 70, 1300];
for (const [i, movement] of movements.entries()) {
  if (movement > 0) {
    console.log(`Movement:- ${i}You deposited ${movement}`);
  } else {
    console.log(`Movement:- ${i}You withdrew ${Math.abs(movement)}`);
  }
}
console.log("-------FOR EACH-----------");
// Same Result as above  because of forEach
movements.forEach(function (movements, i) {
  if (movements > 0) {
    console.log(`Movements ${i}  You deposited ${movements}`);
  } else {
    console.log(`Movements ${i} You withdrew ${Math.abs(movements)}`);
  }
});
