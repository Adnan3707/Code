const dogs = [
  { weight: 22, curFood: 250, owners: [`Alice`, `Bob`] },
  {
    weight: 22,
    curFood: 250,
    owners: [`Alice`, `Bob`],
  },
  {
    weight: 32,
    curFood: 340,
    owners: [`Michael`, "Sarah"],
  },
];

// 1
dogs.forEach((dog) => (dog.recFood = Math.trunc(dog.weight ** 0.75 * 28)));
console.log(dogs);
console.log("Problem 1 Ends");
// 2.

const dogSarah = dogs.find((dog) => dog.owners.includes("Sarah"));
console.log(dogSarah);
console.log(
  `Sarahs dog is eating ${
    dogSarah.curFood > dogSarah.recFood ? `much` : "little"
  }`
);
console.log(`Problem 2 Ends`);
//3.
const ownersEatTooMuch = dogs
  // .filter((dog) => dog.curFood > dog.recFood)
  .map((dog) => dog.owners)
  .flat();
console.log(ownersEatTooMuch);
console.log("Problem 3 Ends");
// 4.
console.log(`${ownersEatTooMuch.join(`and`)}'s dogs eat too much!`);
console.log(`${ownersEatTooMuch.join("and")}'s dogs eat too little!`);
console.log("Problem 4 Ends");
// 5.
console.log(dogs.some((dog) => dog.curFood === dog.recFood));
console.log("Problem 5 Ends");
// 6.
// current > (recomended * 0.99) && current < (recomended *1.10)
const checkEatingOkay = (dog) =>
  dog.curFood > dog.recFood * 0.9 && dog.curFood < dog.recFood * 1.1;
console.log(dogs.some(checkEatingOkay));
console.log("Problem 6 Ends");
// 7.
console.log(dogs.filter(checkEatingOkay));
console.log("Problem 7 Ends");
// 8.
const dogsSorted = dogs.slice().sort((a, b) => a.recFood - b.recFood);
console.log(dogsSorted);
console.log("Problem 8 Ends");
