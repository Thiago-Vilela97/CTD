import { BrowserRouter, Routes, Route } from 'react-router-dom'
import Contact from './pages/Contact';
import Home from './pages/Home';
import Details from './pages/Details';
import PageNotFound from './pages/404';

function RoutesConfig() {
 
  return (   
    <BrowserRouter>
      <Routes>
        <Route path="/home" element={<Home />}/>
        <Route path="/contact" element={<Contact />}/>
        <Route path="/details" element={<Details />}/>
        <Route path="*" element={<PageNotFound/>}/>      
      </Routes>
    </BrowserRouter>
  )
}

export default RoutesConfig;
