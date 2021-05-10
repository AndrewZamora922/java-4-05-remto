function myDisplay(someThing) {
    document.getElementById("demo").innerHTML = someThing;
  }

  function myCalc(num1, num2) {
    let sum = num1 + num2;
    return sum;
  }

  let result = myCalc(5, 5);
  myDisplay(result);


let array = [1,2,3]

let sum = array.map((i)=>{
    return i;
})


let numbers = [1,2,3,4,5,6]

numbers.sort((a, b) => a - b)

console.log(numbers)


console.log("one")

setTimeout(function afterTwo() {
    console.log("two")
}, 2000)

console.log("three")

setInterval(myFunction, 1000)
function myFunction() {
    let date = new Date();

    document.getElementById("demo").innerHTML = 
    date.getHours() + ":" +
    date.getMinutes() + ":" +
    date.getSeconds()
}
myFunction()


function myDisplay(someThing) {
    document.getElementById("demo").innerHTML = someThing;
  }

function getFile(callback) {
    let req = new XMLHttpRequest()
    req.open("GET", "myCar.html")
    req.onload = function(){
        if(req.status === 200){
            callback(this.responseText)
        }else{
            callback("Error", req.status)
        }
    }
    req.send();
}

getFile(myDisplay)