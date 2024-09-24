// write a program to print fabonacci series.

let userValue = 23;

let firstValue = 0;
let secondValue  = 1;
let finalValue = 1;
while(firstValue <= userValue){
    console.log(finalValue)
    finalValue = firstValue + secondValue
    firstValue = secondValue;
    secondValue = finalValue
}