const JuliArr1 = [3, 5, 2, 12, 7];
const KateArr1 = [9, 16, 6, 8, 3];
const JuliArr2 = [9, 16, 6, 8, 3];
const KateArr2 = [10, 5, 6, 1, 4];
const checkDogs = function (dogsJulia, dogsKate) {
  const dogsJuliaCorrected = dogsJulia.slice();
  dogsJuliaCorrected.splice(0, 1);
  dogsJuliaCorrected.splice(-2);
  // Or We Could use> dogsJulia.slice(1,3);
  const dogs = dogsJuliaCorrected.concat(dogsKate);
  dogs.forEach(function (dogs, i) {
    if (dogs >= 3) {
      console.log(`Dog number ${i + 1} is an adult , and is ${dogs} Years old`);
    } else {
      console.log(`Dog number ${i + 1} is still a puppy`);
    }
  });
};
checkDogs(JuliArr2, KateArr2);
