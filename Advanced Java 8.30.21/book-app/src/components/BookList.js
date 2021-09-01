import React from 'react';
import Book from './Book';

export default class BookList extends React.Component
{
    render() {
        console.log(this.props.bookActions)
        return (
            <div>
                {Object.values(this.props.books).map(book =>
                    <Book key={book.id}
                    book={book}
                    actions={this.props.bookActions}
                    />
                )}
            </div>
        ); 
    };
}