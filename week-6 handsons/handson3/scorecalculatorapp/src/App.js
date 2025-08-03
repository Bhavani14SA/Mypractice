import './App.css';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <div className="App">
      <CalculateScore name="Bhavani" school="CognizantFSE" total={450} goal={5} />
    </div>
  );
}

export default App;
