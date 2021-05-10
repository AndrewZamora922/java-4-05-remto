// Functions


// function saySomething(numOne, numTwo, numThree){
//     let result = 0;
//     return numOne + numTwo - numThree;
// }

// let result = saySomething(1, 5, 10);

// console.log(result);


// // creating a function using the keyword "function". Set parameters
// function add(a,b){
// let sum = a+b;
// // return the result of the function
//     return sum;
// }
// // cal the function with the name of the function
// let result = add(5, 5);
// console.log(result);


// function add(...rest){
//     let sum = 0;
// console.log('sum', sum);
// console.log('length of the array', rest.length);
//     for(let i = 0; i < rest.length; i++){
//         console.log('i of for loop', i);
//         sum += rest[i];
//     }
// console.log('return sum', sum);
//     return sum;
// }

// let result = add(1,2,4,6,7,4,7,3);

// console.log(result);

// Create a variable billAmount and store a random number (ie: 100)

// Create a function gratuity()

// gratutity should multiply the value of billAmount by 20% (hint: use 0.2) and return the value

// Create a function totalWithGrat()

// totalWithGrat should take in the amount as an argument, call the gratutity function, add the returned value to the original bill amount, and return the total bill + gratuity

// Append the return value of totalWithGrat to the following phrase: "Your total including gratuity is:" and log it to the console

// Only invoke the totalWithGrat function when logging the result

// Bonus: Find a way to fix the decimal point to only 2 places (ie: 120.00)

// let billDue = 100.59;

// function gratutity(){

//     return billDue * 0.2;
// }

// function totalWithGrat(amount){

//     return gratutity() + amount;
// }

// let result = `Your total, including the gratutity is: $ ${totalWithGrat(billDue).toFixed(2)}`
// console.log(result);


// let diffFuunction = function(){
//     console.log("word");
// }

// // unanimous function
// let calc = {
//     add: function(a,b){
//         return a+a;
//     }
// }

// let result = calc.add(2,8);
// console.log(result);


// let array = [
//     ['anonymous', 'arr'],
//     {name: 'anonymous obj'},
//     function(){return 'this function'}
// ]

// console.log(array[0][1]);
// console.log(array[1].name);
// console.log(array[2]());


// (function(){
//     let str = "private variables"
//     console.log(str);
// }());


// // scope chain and closure
// let city = "phx";
// let greet = function(){
//     console.log('hello', city)
// };

// greet();

// nested scope

// function outer(){
//     let x = 'x';
//     function inner(){
//         let y = 'y';
//         console.log(x);
//     };
//     inner();
//     console.log(x);
//     console.log(y);
// }

// outer();

// // name conflicts

// const name = 'david';

// let greet = function(){
//         const name = 'Erik'
//     console.log(name)
// }


// console.log(name)
// greet();


// // this.

// let teacher = {
//     name: 'Erik',
//     hello: function(){
//         console.log(this.name);
//     }
// }

// teacher.hello();


// function sayName(){
//     console.log(this.name)
// }

// let teacher1 = {
//     name:"asdf",
//     speak: sayName
// };

// let teacher2 = {
//     name:"xzhz",
//     speak: sayName
// };

// teacher1.speak();
// teacher2.speak();


function add(arr){
    let sum = 0;
    for(let i = 0; i < arr.length; i++){
        sum += arr[i]
        // console.log(i)
    }
    return sum;
}

let result = add([1,2,3,4,])

console.log(result)