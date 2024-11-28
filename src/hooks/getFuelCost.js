import { useState, useEffect } from 'react';
import axios from 'axios';

// Optionally, use environment variables for the base URL
const API_BASE_URL = 'http://localhost:8080/api/estimates/fuel-cost';

/**
 * Custom hook to fetch distance between two ports.
 *
 * @param {string} portA - The starting port.
 * @param {string} portB - The destination port.
 * @returns {Object} - { data, error, loading }
 */
const useGetFuelCost = (departurePort, arrivalPort) => {
  const [data, setData] = useState(null);
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState(null);

  useEffect(() => {
    if (departurePort && arrivalPort) {
      const fetchDistance = async () => {
        setLoading(true);
        try {
          const response = await axios.get(
            `${API_BASE_URL}?portA=${encodeURIComponent(departurePort)}&portB=${encodeURIComponent(arrivalPort)}`
          );
          setData(response.data);
        } catch (err) {
          setError(err);
        } finally {
          setLoading(false);
        }
      };

      fetchDistance();
    }
  }, [departurePort, arrivalPort]);

  return { data, loading, error };
};


export default useGetFuelCost;
