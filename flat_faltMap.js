const arr = [[1, 2, 3], [4, 5, 6], 7, 8];
console.log(arr.flat());

const arrDeep = [[1, 2, 3], [4, 5, 6], 7, 8];
console.log(arrDeep.flat(2));

// flatMap Combines map and flat into single method
const d = arr.flatMap((x) => [[x * 3]]);
console.log(d);
