import logo from './logo.svg';
import './App.css';
import Welcome from './Welcome';
import WelcomeClass from './WelcomeClass';

function App() {
  
  const element = <h2>This is JSX (or pseudo-HTML)</h2>;
  const character = 'bart';
  const simpsons = <h2>homer, lisa, marge, maggie, {character}</h2>;
  return (
    <div>

      <h1>Hello from React!</h1>
      <Welcome name="LeVar Burton"/>
      <WelcomeClass name="Jimmy" />
      {element}
      {simpsons}
    </div>
  );
}

export default App;
