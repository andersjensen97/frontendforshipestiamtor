// src/App.js
import React, { useEffect, useState } from 'react';
import { fetchData } from './api';

const App = () => {
  const [cargo, setCargo] = useState([]);

  useEffect(() => {
    const fetchCargoData = async () => {
      try {
        const departure = 'someDeparture';
        const arrival = 'someArrival';
        const vesselType = 'someVesselType';
        const weight = 'someWeight';
        const data = await fetchData(departure, arrival, vesselType, weight);
        setCargo(data);
      } catch (error) {
        console.error('Error:', error);
      }
    };

    fetchCargoData();
  }, []);

  return (
    <div>
      <h1>Routes</h1>
      <ul>
        {cargo.map((item) => (
          <li key={item.id}>{item.name}</li>
        ))}
      </ul>
    </div>
  );
};

export default App;