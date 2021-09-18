// String
const owners = ["Jonas", "Zach", "Adam", "Martha"];
const movements = [-130, 150, 200, -561, -555, 587, -985];
console.log(owners.sort());
console.log(owners);

// Numbers
// Asscending
console.log(movements);
movements.sort((a, b) => {
  if (a > b) return 1;
  else if (a < b) return -1;
});
console.log(movements);
// Decending
movements.sort((a, b) => {
  if (a > b) return -1;
  else if (a < b) return 1;
});
console.log(movements);
