function newPerson(name){
const obj = {};
obj.name = name;
obj.greeting = function(){
    console.log(`hi, I'm ${obj.name}.`)
}
return obj.name
}

// let results = newPerson("Erik");

Const Erik = newPerson('Erik')
Erik.name;
Erik.greeting;

console.log(result);


// function Person(name){
//     this.name = name
//     this.greeting = function(){
//         console.log(`Hi, I'm ${this.name}.`)
//     }
    

// }


// let person1 = new Person('Joe')

// console.log(person1.greeting())


// function Person(first, last, age, favColor){
//     this.name = {
//         first: first,
//         last: last
//     }
//     this.age = age;
//     this.favColor = favColor;

//     this.bio = function(){
//         console.log(`Hi, I'm ${this.name.first} ${this.name.last}. My favorite color is ${this.favColor}.`)
//     }
//     this.greeting = function(){
//         console.log(`Hi, I'm ${this.name}.`)
//     }
// }

// let person1 = new Person('John', 'Doe', 45, 'green');
// console.log()

// person1.bio()



// function Car(model, type, motor, year){
//     this.model = model;
//     this.type = type;
//     this.motor = motor;
//     this.year = year;

//     this.started = function(){
//         console.log(`Starting your car`)
//     }

//     this.checkMotor = function(){
//         console.log('car not started')
//     }
// }


// let car1 = new Car('ford', 'mustang', 'v8', 1999);
// console.log(car1.model)
// console.log(car1.started())
// console.log(car1.checkMotor())


// class Rectangle{
//     constructor(height, width){
//         this.height=height;
//         this.width=width;
//     }

//     get area(){
//         return this.calcArea()
//     }

//     calcArea(){
//         return this.height + this.width;
//     }
// }


// const square = new Rectangle(5,5)

// console.log(square.area)

