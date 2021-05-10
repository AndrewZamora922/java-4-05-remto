import React from "react";
import Note from "./Note"

const Board = () => {
  return (
    <div>
      <div>
        <div className="div-board">
          <div className="row">
            <Note />
            
            
          </div>
        </div>
        <div>
          <button className="btn btn-success add-button">Add</button>
        </div>
      </div>
    </div>
  );
};

export default Board;
