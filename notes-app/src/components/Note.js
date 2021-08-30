import React, {Component} from 'react';
import '../css/Note.css';
import PropTypes from 'prop-types';

class Note extends Component {
  constructor() {
    super();
  }

  render() {
    return (
      <div className="col-sm-6">
        <div className="card card-view">
          <div className="card-body">
            <h5 className="card-title">{this.props.title}</h5>
            <p>{this.props.body}</p>
            <button className="btn btn-info " margin="5" padding="2">Edit</button>
            <button className="btn btn-danger"margin="5" padding="2">Delete</button>
          </div>
        </div>
      </div>
    );
  }
}

Note.defaultProps = {
    title: "A cool title",
    body: "A cool body",
  };

Note.propTypes = {
    title: PropTypes.string
  };  

export default Note;