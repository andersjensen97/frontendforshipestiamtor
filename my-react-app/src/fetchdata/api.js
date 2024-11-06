import React, { useEffect, useState } from 'react';


function useCargoData() {
    const [cargo, setCargo] = useState([]);
    const [error, setError] = useState(null);

    useEffect(() => {
        fetch('/localhost/searoutesapi/Cargo')
            .then((response) => {
                if (!response.ok) throw new Error('Network response was not ok');
                return response.json();
            })
            .then((data) => setCargo(data))
            .catch((error) => setError(error.message));
    }, []);

    return { cargo, error };
}

function useEstimateData() {
    const [estimate, setEstimate] = useState([]);
    const [error, setError] = useState(null);

    useEffect(() => {
        fetch('/localhost/searoutesapi/Estimate')
            .then((response) => {
                if (!response.ok) throw new Error('Network response was not ok');
                return response.json();
            })
            .then((data) => setEstimate(data))
            .catch((error) => setError(error.message));
    }, []);

    return { estimate, error };
}

function usePortData() {
    const [port, setPort] = useState([]);
    const [error, setError] = useState(null);

    useEffect(() => {
        fetch('/localhost/searoutesapi/Port')
            .then((response) => {
                if (!response.ok) throw new Error('Network response was not ok');
                return response.json();
            })
            .then((data) => setPort(data))
            .catch((error) => setError(error.message));
    }, []);

    return { port, error };
}

function useVesselData() {
    const [vessel, setVessel] = useState([]);
    const [error, setError] = useState(null);

    useEffect(() => {
        fetch('/localhost/searoutesapi/Vessel')
            .then((response) => {
                if (!response.ok) throw new Error('Network response was not ok');
                return response.json();
            })
            .then((data) => setVessel(data))
            .catch((error) => setError(error.message));
    }, []);
    return { vessel, error };
}

export { useCargoData, useEstimateData, usePortData, useVesselData };
