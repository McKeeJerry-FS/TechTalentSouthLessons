import React from 'react';
import logo from './logo.svg';
import './App.css';
import BookList from './components/BookList';
import { mapIntoObject, data } from './components/Book';


export default class App extends React.Component {
  state = {
      books: mapIntoObject(data.books),
      authors: mapIntoObject(data.authors)
  };
  bookActions = {
      lookupAuthor: authorId => this.state.authors[authorId],
  };
  render() {
    console.log(this.bookActions)
      return (
          <BookList
          books={this.state.books}
          bookActions={this.bookActions}
          />
      );
  }
}