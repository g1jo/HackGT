//import './App.css';
import StyleSelect from '../components/Style';
import ButtonAppBar from '../components/Toolbar';
import ColorSelect from '../components/Color'
import TempSelect from '../components/Temp';
import Buttons from '../components/Clothing'

export default function Input() {
  return (
    <div className="Clothing Input">
      <ButtonAppBar/>
      &nbsp;
        <div style={{position: 'absolute', left: '35%'}}>
          <h2>Please Enter Your Clothing Item</h2>
          &nbsp;
          <StyleSelect/>
          &nbsp;
          <ColorSelect/>
          &nbsp;
          <TempSelect/>
          &nbsp;
          <center><button>Add</button></center>
        </div>
    </div>
  );
}
