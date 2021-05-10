// var, let, const

// // numbers
// let x;
// x = 5;

// let h = 7.009;

// // snake case
// const my_fave_number = 7;

// let y = x % my_fave_number;

// // strings

// let a = "hello";
// let b = "this is a string";
// let c = "7";
// let d = "it's seven";
// // this is escape
// let f = "it's seven";

// //this is a new line
// let g = "it's \n seven";

// //boolean

// let i = false;

// // tells you what it is
// console.log(typeof h);

// //Implicit

let num = 7+7+7;

let num2 = 5+5+'5';
let num3 = Number('3'+3+3);
console.log(num3);

let amount = 1000;

let donation = console.log("How much would you like to give me")

amount = Number(donation) + amount

console.log("what we have: "+ amount)

let strum = parseInt("10");

let newAmount = parseFloat("10.25");

let numStr = toString(5.99);

console.log(typeof numStr);

// //concatenation

// let greetting = "Hello";

// let fName = "Joe"

// console.log(greetting + " " + fName + " ")

// //Template literals 

// console.log(`${greetting} ${fName}, how are you?`)


// let something = null;

// console.log(typeof something)

// // Flow and control

// let x = true;
// let seven = 7;

// console.log('seven', seven === '7')

// if(x){
//     console.log(true)
// }else if (x===true){
//     console.log('this wont run');
// }else{
//     console.log(false);
// }



// // so the && bith have to be true
// // the || only one needs to be true 

// let temp = 90;

// if(temp > 70 && temp < 95){
//     console.log("print")
// }else {
//     console.log("no print")
// }


// for(let i = 0; i < 10; i++){
//     console.log('for loop', i);
// }

// for(let bottle = 10; bottle >= 0; bottle--){
//     if(bottle === 0){
//         console.log("go buy more")
//     }else{
//         console.log(`${bottle} more to drink`)
//     }
// }


// // start
let n = 0;

// //end
// while(n > 10){
//     n++
//     console.log(n)
// }


// do{
//     n = n+1
//     console.log(n)
// }while(n > 10)

switch(n){
    case 3:
        console.log('three')
        break;
    case 1:
        console.log('one')
        break;
    case 2:
        console.log('two')
        break;
    default:
        console.log('default')
        break;
}