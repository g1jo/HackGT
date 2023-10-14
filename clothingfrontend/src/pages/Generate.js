//import './App.css';
import StyleSelect from '../components/Style';
import ButtonAppBar from '../components/Toolbar';
import RainSelect from '../components/Rain'
import TempSelect from '../components/Temp';
import Buttons from '../components/Clothing'

export default function Input() {
  return (
    <div className="Clothing Finder">
      <ButtonAppBar/>
      &nbsp;
        <div style={{position: 'absolute', left: '35%'}}>
          <h2>Please Enter Your Clothing Item</h2>
          &nbsp;
          <StyleSelect/>
          &nbsp;
          <TempSelect/>
          &nbsp;
          <RainSelect/>
          &nbsp;
          <center><button>Generate</button></center>
        </div>
    </div>
  );
}
