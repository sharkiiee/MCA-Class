//program for sum of n natural numbers

let userValue = 23;
let finalValue = 0;
for(let i =1; i <= userValue; i++){
    finalValue = i + finalValue;
}

console.log("The sum of natural number till the given value is : " + finalValue)