import React, { useState } from "react";
import axios from "axios";

function App() {
  const [type, setType] = useState("");
  const [toll, setToll] = useState(null);

  const calculateToll = async () => {
    const res = await axios.post("http://localhost:8080/api/toll/calculate", { type });
    setToll(res.data);
  };

  return (
    <div>
      <h2>Toll Calculator</h2>
      <input onChange={(e) => setType(e.target.value)} placeholder="Vehicle Type" />
      <button onClick={calculateToll}>Calculate</button>
      {toll && <h3>Toll Amount: {toll}</h3>}
    </div>
  );
}

export default App;