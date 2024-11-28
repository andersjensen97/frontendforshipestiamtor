import { useState, useEffect } from 'react';
import axios from 'axios';

// Optionally, use environment variables for the base URL
const API_BASE_URL = 'http://localhost:8080/api';

/**
 * Custom hook to fetch distance between two ports.
 *
 * @param {string} portA - The starting port.
 * @param {string} portB - The destination port.
 * @returns {Object} - { data, error, loading }
 */
const useGetPorts = (portA, portB) => {
  const [data, setData] = useState(null);
  const [error, setError] = useState(null);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    // Define an async function inside the useEffect
    const fetchDistance = async () => {
      try {
        const response = await axios.get(`${API_BASE_URL}/ports`);
        setData(response.data);
      } catch (err) {
        setError(err);
      } finally {
        setLoading(false);
      }
    };

    fetchDistance();
  }, []); // Re-run if portA or portB changes

  return { data, error, loading };
};

export default useGetPorts;
