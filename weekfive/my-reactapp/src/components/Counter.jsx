import React from 'react'

const Counter = (props) =>{
console.log('numArray', props.arrayOfNums)
const num = props.arrayOfNums.map((n)=>{
    return n*2
})
    return (
        <div>
        <div>The count is {props.count}</div>
        <div>Toggle: {props.isToggled ? 'On' : 'Off'}</div>
        <div>
        {props.arrayOfNums.map(n=>*2)}
        </div>
        </div>
    )
}



export default Counter;