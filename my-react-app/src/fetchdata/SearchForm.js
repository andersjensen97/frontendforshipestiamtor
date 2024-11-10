import React, { useState, useEffect } from 'react';

const SearchForm = () => {
  const [departurePort, setDeparturePort] = useState('');
  const [arrivalPort, setArrivalPort] = useState('');
  const [vesselType, setVesselType] = useState('');
  const [fuelType, setFuelType] = useState('');
  const [weight, setWeight] = useState('');
  const [searches, setSearches] = useState([]);

  // Function to save search in local storage
  const saveSelection = () => {
    const newSearch = {
      departurePort,
      arrivalPort,
      vesselType,
      fuelType,
      weight,
      date: new Date().toLocaleString(),
    };

    const updatedSearches = [...searches, newSearch];
    setSearches(updatedSearches);
    localStorage.setItem('portSearches', JSON.stringify(updatedSearches));
  };

  // Retrieve searches from local storage on component load
  useEffect(() => {
    const savedSearches = JSON.parse(localStorage.getItem('portSearches')) || [];
    setSearches(savedSearches);
  }, []);

  return (
    <div>
      <select onChange={(e) => setDeparturePort(e.target.value)}>
        <option value="">Select port of departure</option>
        <option value="New York">New York</option>
        <option value="Los Angeles">Los Angeles</option>
        {/* Add more options*/}
      </select>

      <select onChange={(e) => setArrivalPort(e.target.value)}>
        <option value="">Select port of arrival</option>
        <option value="London">London</option>
        <option value="Tokyo">Tokyo</option>
        {/* Add more options*/}
      </select>

      <select onChange={(e) => setVesselType(e.target.value)}>
        <option value="">Select vessel type</option>
        <option value="Cargo">Cargo</option>
        <option value="Tanker">Tanker</option>
        {/* Add more options*/}
      </select>

      <select onChange={(e) => setFuelType(e.target.value)}>
        <option value="">Select fuel type</option>
        <option value="Diesel">Diesel</option>
        <option value="Gasoline">Gasoline</option>
        {/* Add more options*/}
      </select>

      <input
        type="number"
        placeholder="Enter weight"
        onChange={(e) => setWeight(e.target.value)}
      />

      <button onClick={saveSelection}>Save search</button>

      <h3>Previous searches:</h3>
      <ul>
        {searches.map((search, index) => (
          <li key={index}>
            Departure: {search.departurePort}, Arrival: {search.arrivalPort}, Vessel: {search.vesselType}, Fuel: {search.fuelType}, Weight: {search.weight} kg, Date: {search.date}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default SearchForm;
