const input = document.getElementsByClassName("userInput");
const output = document.getElementsByClassName("output")
const btn = document.getElementsByClassName("btn")


btn.addEventListeneer("click" , (e)=>{
  e.preventDefault();
  const input = document.getElementsByClassName("userInput").value
})


const asyncFunction = async (city) => {
  let result;
  await fetch(`https://geocode.xyz/${city}?json=1`)
  // call back for the response
    .then((response) => response.json())
    .then((data) => {
      console.log(data);
      return (result = data);
    });
  let latt = result.latt;
  let longt = result.longt;
  let cityName = result.standard.city;
  console.log(`city: ${cityName}, latitude:${latt}, longitude: ${longt}`);
};
const result = asyncFunction("Dallas");
console.log(result);


