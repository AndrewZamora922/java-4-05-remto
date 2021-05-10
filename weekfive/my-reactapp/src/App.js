import React, { useState } from "react";
import "./App.css";
import BasicForm from "./components/BasicForm";
import Counter from "./components/Counter";
import Board from "./components/note/Board"

function App() {
  const [count, setCount] = useState(0);
  const [isToggled, setIsToggled] = useState(false);
  const [numArray, setNumArray] = useState([1, 2, 3, 4, 5, 6, 7, 7]);

  const handleClick = () => {
    setCount(count + 1);
  };

  const handleToggled = () => {
    setIsToggled(!isToggled);
  };

  return (
    <div className="App">{
        // <Counter count={count} isToggled = {isToggled} arrayOfNums={numArray}/>
        // <button onClick={handleClick}>click</button>
        // <button onClick={handleToggled}>toggle</button>
        // <div>
        // <BasicForm />
        // </div>
      }
      <Board />
    </div>
  );
}

export default App;
