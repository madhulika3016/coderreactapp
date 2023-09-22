
import './App.css';
import {BrowserRouter, Routes, Route } from 'react-router-dom';
import FooterComponent from './components/FooterComponent';
import HeaderComponent from './components/HeaderComponent';
import ListCoderComponent from './components/ListCoderComponent';
import CoderComponent from './components/CoderComponent';

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <HeaderComponent />
        <div className= "container">
          <Routes>
              <Route path = "/" element = { <ListCoderComponent /> }></Route>
              <Route path = "/coders" element = { <ListCoderComponent /> }></Route>
              <Route path = "/add-coder" element = { <CoderComponent />} ></Route>
              <Route path = "/edit-coder/:id" element = { <CoderComponent />}></Route>
            </Routes>
        </div>
        <FooterComponent />
        </BrowserRouter>
      
    </div>
  );
}

export default App;
