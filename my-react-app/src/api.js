import React, { useEffect, useState } from 'react';
import { fetchDummyRoutes } from './api';

function App() {
  const [routes, setRoutes] = useState([]);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    const getRoutes = async () => {
      const data = await fetchDummyRoutes();
      setRoutes(data);
      setLoading(false);
    };

    getRoutes();
  }, []);

  return (
    <div className="App">
      <header className="App-header">
        <h1>Routes</h1>
        {loading ? (
          <p>Loading...</p>
        ) : (
          <ul>
            {routes.map(route => (
              <li key={route.id}>{route.name}</li>
            ))}
          </ul>
        )}
      </header>
    </div>
  );
}

export default App;
