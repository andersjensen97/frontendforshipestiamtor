import React, { useEffect, useState } from 'react';
import { fetchData } from './api';

const getData = () => {
  const [cargo, setCargo] = useState([]);

  useEffect(() => {
    const fetchCargoData = async () => {
      try {
        const data = await fetchData('departure', 'arrival', 'vesselType', 'weight');
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

export default getData;

// src/services/api.js
export const fetchData = async (departure, arrival, vesselType, weight) => {
  try {
    const response = await fetch(`http://localhost:8080/api/shipping/calculate?departure=${encodeURIComponent(departure)}&arrival=${encodeURIComponent(arrival)}&vesselType=${encodeURIComponent(vesselType)}&weight=${encodeURIComponent(weight)}`, {
      method: 'GET',
      headers: {
        'Content-Type': 'application/json'
      }
    });
    if (!response.ok) {
      throw new Error(`Network response was not ok: ${response.statusText}`);
    }
    const data = await response.json();
    return data;
  } catch (error) {
    console.error('Error:', error);
    throw error;
  }
};
