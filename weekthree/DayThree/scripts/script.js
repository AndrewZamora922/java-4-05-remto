// // taking a function as a parameter


// function add(num1, num2){
//     return num1 + num2;
// }

// function doMath(operation, num1, num2){
//     return add(num1, num2);
// };

// let result = doMath(add, 5, 10);

// console.log(result);

// // filter
// let students =[
//     {name:'John lennon', average:90},
//     {name:'Ringo Starr', average:58},
//     {name:'Paul McCartney', average:83},
// ]

// for(let i = 0; i < students.length; i++){
//     if(students[i].average > 60){
//         console.log(students[i])
//     }
// }

// // students.average

// let passingStudents = students.filter(function(students){
//     return students.average > 60
// })

// // Online for the filter with one parameter
// let passingStudents = students.filter(students=>students.average > 60)


// console.log('passing', passingStudents)

// passingStudents ===[

// ]


// let students = [
//     {firstName: 'Cam', lastName: 'Newton'},
//     {firstName: 'Ted', lastName: 'Gin'},
//     {firstName: 'Greg', lastName: 'Olsen'},  
// ]

// for(let i = 0; i < students.length; i++){
//     console.log(students[i])
// }

// // students.firstName student is the value(it can be anyhting we want to discribe the object)
// let fullName = students.map(function(student){
//     return `${student.firstName} ${student.lastName}`
// })

// let fullName = students.map(student=> `${student.firstName} ${student.lastName}`)


// console.log('student', fullName)


// let students = [
//     {firstName: 'Cam', completed: 6},
//     {firstName: 'Ted', completed: 10},
//     {firstName: 'Greg', completed: 8},
// ]

// let total = students.reduce(function(acc, current){
//     return acc + current.completed;
// }, 0)

// console.log('total', total)



	
// let superHeroes =[
//     ["Batman", "Bruce Wayne"],
//     ["Spiderman", "Peter Parker"],
//     ["The Flash", "Barry Allen"]
//   ]
// /** 
// Create an Array named superHeroes shown above
// Create a secretIdentity variable
// Assign superHeroes.map() to the secretIdentity variable
// Assign an anonymous function to superheroes.map() as an argument
// Your anonymous function should have one parameter named revealArray
// Inside the block of your anonymous function:
// You'll be working with revealArray as an argument
// Using revealArray, return a string that will join the two array items.
// join them together with the string "is" (ie: "Batman is Bruce Wayne")
// Log the results to the screen and join them with a line break. */


// let secrretIdentity = superHeroes.map(revealArray=>{
//     return revealArray.join(" is ")
// })

// console.log(secrretIdentity.join("\n"))



// let players =[
//     {firstName:'Cam', lastName:'Newton', position:'QB', touchdowns: 32},
//     {firstName:'Derek', lastName:'Anderson', position:'QB', touchdowns: 0},
//     {firstName:'Jonathan', lastName:'Stewart', position:'RB', touchdowns: 12},
//     {firstName:'Mike', lastName:'Tolbert', position:'RB', touchdowns: 8},
//     {firstName:'Fozzy', lastName:'Whittaker', position:'RB', touchdowns: 3},
//     {firstName:'Ted', lastName:'Gin', position:'WR', touchdowns: 9},
//     {firstName:'Devin', lastName:'Funchess', position:'WR', touchdowns: 2},
// ];

// players.find(function(player){
//     return player.firstName === 'Mike'
// })

// players.filter(function(player){
//     return player.position === 'RB'
// })

// players.map(function(value){
//     return value.lastName;
// })

// // Full name of all running backs with more than 5 touchdowns
// players.filter(function(player){
//     return player.touchdowns > 5 && player.position == 'RB'
// }).map(function(player){
//     return ` the players with more than 5 touchdowns ${player.firstName} ${player.lastName}`
// })

// console.log(filterRBTouchdowns)


// // do something later
// setTimeout(function(){
//     console.log("later")
// }, 5000)
// console.log("now")

// button.addEventListiner('click', function(){
//     alert("click has been done")
// })


// let teacher ={
//     name:'Shay',
//     talking: function(){
//         setTimeout(function(){
//     console.log(`later my name is ${this.name}`)
// }, 3000)

// console.log(`now my name is ${this.name}`)
//     }
// }

// teacher.talking()

// let teacher = {
//     name: 'Shane',
//     speak: function(){

//         //bind a function to a specific context
//         let boundFunction = function(){
//             console.log('later my name is ' + this.name);
//         }.bind(this);

//         // boundfunction will always run in bound context
//         setTimeout(boundFunction, 1000);
//     }
// }

// teacher.speak();


// let students = [
//     {name:'Erik'},
//     {name:'Jane'},
//     {name:'Steven'},
// ]

// let name = students.map(students => students.name)



/**Going back to our slideshow object, let's add some functionality.

Create an empty property named playInterval

A play() function that moves to the next photo ever 2000ms until the end.

Tip - use playInterval = setInterval(fn,ms).

A pause() function that stops the slideshow

Tip - use clearInterval(playInterval)

Automatically pause the slideshow if it gets to the end of the photolist while playing. */


// let slideshow ={
//     photolist:['birds', 'puppies', 'rainbows', 'kittens', 'babies'],
        
//     currentIndex:0,

//         nextPhoto: function(){
//             if(this.currentIndex < this.photolist.length){
                
//                 console.log("current photo is: "+ this.photolist[this.currentIndex])
//                 this.currentIndex++;
//             }else{
//                 console.log("end of the slideshow")
//                 this.pause();
//             }
//         },
//         prevPhoto: function(){
//             if(this.currentIndex > 0){
//                 this.currentIndex--;
//                 console.log("current photo is: "+ this.photolist[this.currentIndex])
//             }else{
//                 console.log("start of slideshow")
//             }
//         },
//         currentPhoto:function(){
//             return this.photolist[this.currentIndex]
//         },
//         playInterval: null,

//         play: function(){
//             let self = this;
//             self.playInterval = setInterval(function(){self.nextPhoto()}, 2000)
//         },
//         pause: function(){
//             clearInterval(this.playInterval)
//         }
//     }

//     slideshow.play()