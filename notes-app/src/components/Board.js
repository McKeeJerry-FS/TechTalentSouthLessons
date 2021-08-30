import React, {Component} from 'react';
import '../css/Board.css';
import Note from '../components/Note';

class Board extends Component {
  constructor() {
    super();
  }

  render() {
    return (
      <div>
        <div className="div-board">
          <div className="row">
            <Note title="Class Notes" body="Always use constructors when extending another class "/>
            <Note title="Bloop" body="bloop"/>
            <Note title="Third Note" body="third note"/>
            <Note />
          </div>
        </div>
        <div>
          <button className="btn btn-success add-button">Add</button>
        </div>
      </div>
    );
  }
}

export default Board;
