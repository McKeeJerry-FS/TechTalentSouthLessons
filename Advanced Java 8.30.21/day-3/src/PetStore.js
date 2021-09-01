import React, {Component} from 'react';

export default class PetStore extends Component{

    constructor() {
        super();
        this.state = {
            petList: [],
            petName: "",
            petBreed: "",
            petAge: 0,
        }
    }

    handleNameInput = (event) =>{
        this.setState({petName:event.target.value})
    }
    handleBreedInput = (event) =>{
        this.setState({petBreed:event.target.value})
    }
    handleAgeInput = (event) =>{
        this.setState({petAge:event.target.value})
    }
    
    handleClick=()=>{
        let petObj = {petName:this.state.petName};
        this.setState(
            {petList: [...this.state.petList, petObj], 
            petName: '', 
            petBreed:'', 
            petAge: 0,});
    }
    
    render(){
        let petElementArr = this.state.petList.map((animal, index)=>{
          return(
            <div key={index}>
              <div>Name: {animal.petName}</div>
              <div>Name: {animal.petBreed}</div>
              <div>Name: {animal.petAge}</div>
            </div>
          )
        })
        return(
          <div>
            <h4>Pet Store Animal List</h4>
            {petElementArr}
            
            <input value={this.state.petName} 
            onChange={this.handleNameInput} 
            placeholder="Pet Name"/>
            
            <input value={this.state.petBreed} 
            onChange={this.handleNameInput} 
            placeholder="Pet Breed"/>
            
            <input value={this.state.petAge} 
            onChange={this.handleNameInput} 
            placeholder="Pet Age"/>
            
            <button onClick={this.handleClick}>Add Animal</button>
          </div>
        )
    }
    
        
    

}


// export default PetStore;