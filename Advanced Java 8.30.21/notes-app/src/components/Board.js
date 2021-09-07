import React, { Component } from 'react';
import '../css/Board.css';
import Note from './Note';
import myFirebase from '../Utility/myFirebase';
import {once} from 'firebase/database';
import {onValue} from 'firebase/database';


class Board extends Component {
    constructor() {
        super();
        this.state = {
            notes: []
        }
        this.firebaseDBref = myFirebase.getFireBaseRef();
        //this.firebaseDBref.once('value').then((snapshot) => console.log(snapshot.val()));
        onValue(this.firebaseDBref, (snapshot) => this.addNote(snapshot.val()), {
            onlyOnce: true,
        })
    }

    addNote(notes) {
        console.log(notes);
        if (notes) {
            for (let key in notes) {
                this.state.notes.push(
                    {id : key,
                    title: notes[key].title,
                    body: notes[key].body }
                )
            };
        } else {
            this.state.notes.push (
                {id: Date.now()}
            )
        };
        
        this.setState({notes: this.state.notes});

    }

    render() {


        return (
            <div>
                <div className="div-board">
                    <div className="row">

                        {
                         this.state.notes.map(note => <Note title={note.title} body={note.body} />)
                        }
          
                    </div>
                </div>
                <div>
                    <button onClick={this.addNote.bind(this)} className="btn btn-success add-button">
                        Add
                    </button>
                </div>
            </div>
        )
    }
}

export default Board;