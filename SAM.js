let arr = ["a", "b", "c", "d", "e"];
let arrc = ["q", "w", "e", "r", "t", "y"];
let arr1 = ["a", "b", "c", "d", "e", "f", "g", "h"];
let arr2 = ["a", "b", "c", "d", "e"];
let arr4 = ["a", "b", "c", "d", "e"];
console.log(arr.slice(-2));
console.log(arr.slice(2));
console.log(arr.slice(1, 3));
console.log(arr);
console.log("splice method");
console.log(arr1.splice(-2));
console.log(arr2.splice(-3));
console.log(arr4.splice(1, 3));
// concat
console.log("concat");
const letters = arr.concat(arrc);
console.log(letters);
// Reverse
console.log("Reverse");
console.log(arr.reverse());
// Join
console.log(letters.join(","));
