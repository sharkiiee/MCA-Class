//Program to print armstrong number - the number is armstrong or not

let N = 153;

let count = 0;
let save = N;

while(save != 0){
    save = save / 10;
    count = count + 1;
}

save = N
let sum = 0

while(save != 0){
     rem = save % 10
     sum = sum + Math.pow(rem,count)
     save = save / 10
}
if(N == sum){
     console.log("Armstrong Number")
}
else{
     console.log("Not Armstrong")
}