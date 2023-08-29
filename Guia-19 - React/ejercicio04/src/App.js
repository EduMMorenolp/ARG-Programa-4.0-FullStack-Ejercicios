
import Footer from "./componentes/footer"
import Navbar from "./componentes/navbar";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import Main1 from "./componentes/main1";
import Main2 from "./componentes/main2";

function App() {
  return (
    <div className="App">
      <div className="App">
        <Router>
          <Navbar />
          <Routes>
            <Route path="/main1" element={<Main1 />} />
            <Route path="/main2" element={<Main2 />} />
          </Routes>
          <Footer />
        </Router>
      </div>
    </div>
  );
}

export default App;
