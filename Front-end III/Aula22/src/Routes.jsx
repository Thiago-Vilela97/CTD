import {BrowserRouter, Routes, Route} from 'react-router-dom'

import Home from "./pages/Home";
import DashboardHome from "./pages/Dashboard/Home";
import DashboardReport from "./pages/Dashboard/Reports";

import Products from "./pages/Products"

const AppRoutes = () => {
    return (
        <BrowserRouter>
            <Routes>
                <Route path="" element={<Home />} />

                <Route path="/dashboard" element={<Dashboard />} >
                    <Route path="" element={<DashboardHome />} />
                    <Route path="" element={<DashboardReport />} />
                </Route>
              
            </Routes>
        </BrowserRouter>
    )
};

export default AppRoutes;