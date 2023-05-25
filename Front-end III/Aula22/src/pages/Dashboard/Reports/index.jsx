import { Outlet } from "react-router-dom";

const Reports = () => {
    return (
        <div>
            <h1>Header</h1>
            <div style={{minHeight: "80vh"}}> 
                <Outlet />
            </div>
            <h1>Footer</h1>
        </div>
    )
};

export default Reports;