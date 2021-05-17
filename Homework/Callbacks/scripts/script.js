// const message = function(){
//     console.log("This message is shown after 3 seconds");
// }

// setTimeout(message, 3000);



var make = "Dodge";
var model = "Ram 1500"
var engine = "V8 Hemi"
function fullName(){
    document.getElementsByName("demo").innerHTML;
    console.log(this.make+ " " + this.model + " " +this.engine);
}
var myCars = {
    make:"Dodge",
    model:"Charger",
    engine:"SRT 8",
    fullName: function(){
        document.getElementsByName("myCars").innerHTML ;
        console.log(this.make + " " + this.model + " " + this.engine);
    }
}

myCars.fullName(); //Dodge Charger
// window.fullName(); //Dodge Ram 1500
fullName(); //Dodge Ram 1500


const ride = function(){
    console.log("Dodge Challenger HellCat")
}

ride()
