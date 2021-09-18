console.log([1, 2, 3, 4, 5, 6, 7, 8, 9]);
console.log(new Array(1, 2, 3, 4, 5, 6, 7, 8, 9));

const x = new Array(7);
console.log(x);
x.push(1);
console.log(x);
x.fill(1, 2, 5);
console.log(x);

// Array.from
const y = Array.from({ length: 7 }, () => 1);
console.log(y);
const z = Array.from({ length: 7 }, (cur, i) => i + 1);
console.log(z);
