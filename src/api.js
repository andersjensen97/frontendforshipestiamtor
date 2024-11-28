import React, { useEffect, useState } from 'react';

function getData() {
  
  const [Cargo, setCargo] = useState([]);
  const [Estimate, setEstimate] = useState([]);
  const [Port, setPort] = useState([]);
  const [Vessel, setVessel] = useState([]);

  useEffect(() => {
    fetch('/localhost/searoutesapi/Cargo')
    .then((response) => {
      if (!response.ok) {
          throw new Error('Network response was not ok');
      }
      return response.json();
  })
  .then((data) => {
      setCargo(data);
  })
  .catch((error) => {
      console.error('There was a problem with the fetch operation:', error);
  });
  }, []);

  useEffect(() => {
    fetch('/localhost/searoutesapi/Estimate')
    .then((response) => {
      if (!response.ok) {
          throw new Error('Network response was not ok');
      }
      return response.json();
  })
  .then((data) => {
      setEstimate(data);
  })
  .catch((error) => {
      console.error('There was a problem with the fetch operation:', error);
  });
  }, []);

  useEffect(() => {
    fetch('/localhost/searoutesapi/Port')
    .then((response) => {
      if (!response.ok) {
          throw new Error('Network response was not ok');
      }
      return response.json();
  })
  .then((data) => {
      setPort(data);
  })
  .catch((error) => {
      console.error('There was a problem with the fetch operation:', error);
  });
  }, []);

  useEffect(() => {
    fetch('/localhost/searoutesapi/Vessel')
    .then((response) => {
      if (!response.ok) {
          throw new Error('Network response was not ok');
      }
      return response.json();
  })
  .then((data) => {
      setVessel(data);
  })
  .catch((error) => {
      console.error('There was a problem with the fetch operation:', error);
  });
  }, []);
}
  return (
    <div>
        <h1>Routes</h1>
          <ul>
          {Cargo.map((Cargo) => (<li key={Cargo.id}>{Cargo.name}</li>))}
          </ul>
        
      
    </div>
  );
export default getData;
