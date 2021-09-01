import logo from './logo.svg';
import './App.css';

function App() {

  let data = [
    {
      name: "Mr.Burns",
      location: "Springfield",
    },
    {
      name: "Marge Simpson",
      location: "Springfield",
    },
  ]

  let elements = data.map((person, index ) =>
    <li>Name: {person.name} Location: {person.location}</li>
  )

  return (
    <div>
      <ul>
        {elements}
      </ul>
    </div>
  );
}

export default App;
