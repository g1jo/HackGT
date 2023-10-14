import './App.css';
import { BrowserRouter, Routes, Route } from 'react-router-dom'
import Home from './pages/Home'
import Input from './pages/Input'
import Generate from './pages/Generate'



export default function App() {
  return (
    <div>
      <BrowserRouter>
        <Routes>
          <Route index element={<Home />}/>
          <Route path="/home" element={<Home />}/>
          <Route path="/input" element={<Input />}/>
          <Route path="/generate" element={<Generate />}/>
        </Routes>
      </BrowserRouter>
    </div>
  )
}







// function App() {
//   return (
//   );
// }
// export default App;
