import React, { Component } from 'react';

export const data = {
    books: [
        {   id: 'b1',
            title: 'Coders at Work',
            price: 2434,
            authorId: 'a2'},
        
            {   id: 'b2',
            title: 'Essays on Software Engineering',
            price: 2399,
            authorId: 'a3'},
            
            {   id: 'b3',
            title: 'Web Usability',
            price: 2250,
            authorId: 'a4'},

            {   id: 'b4',
            title: 'Clean Code',
            price: 3224,
            authorId: 'a1'},
        ],
    authors: [
        { id: 'a1', firstName: 'Robert', lastName: 'Martin' },
        { id: 'a2', firstName: 'Peter', lastName: 'Seibel' },
        { id: 'a3', firstName: 'Frederick', lastName: 'Brooks' },
        { id: 'a4', firstName: 'Steve', lastName: 'Krug' },
    ]
};

export function mapIntoObject(arr) {
    return arr.reduce(function(acc, curr) {
        acc[curr.id] = curr;
        return acc;
    }, {});
}

export default class Book extends React.Component {
    render() {
        console.log(this.props.actions)
        const { book } = this.props;
        const author = this.props.actions.lookupAuthor(book.authorId);
        return (
            <div>
                <div>{book.title}</div>
                <div>By: {author.firstName} {author.lastName}</div>
                <div>Price: {book.price}</div>
                <hr />
            </div>
        );
    }
}





