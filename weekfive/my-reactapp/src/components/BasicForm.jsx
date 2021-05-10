import React,{ useState } from "react";

const BasicForm = ()=>{
    const [value, setValue] = useState('')
    const [name, setName] = useState('')

const handleChange = (event)=>{
    setValue(event.target.value)
    console.log('change', value)
}
}

const handleSubmit = (event)=>{
    event.preventDefault();
    setValue("");
    setName(value)
    console.log('change', value)
}


const BasicForm = ()=>{
    return (
        <form onSubmit={handleSubmit}>
        <h2>Hello, </h2>
        <lable>Nmae: </lable>
        <input type="text" value={value} onChange={handleChange} />

        <input type="submit"/>
        </form>
    )
}


export default BasicForm