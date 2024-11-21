
import React, { useEffect, useRef } from "react";
import mapboxgl from "mapbox-gl";
import "./Map.css"; // Optional for styling

// Add your Mapbox access token here
mapboxgl.accessToken = "pk.eyJ1IjoiZnJlZGVyaWtzYmVyZzIwMDAiLCJhIjoiY20zcWF5ODB5MGtodjJscXRncjY3aHdpdCJ9.CKjEC27DY3b8ESMIN5WxcQ";

const Map = () => {
  const mapContainer = useRef(null);

  useEffect(() => {
    const map = new mapboxgl.Map({
      container: mapContainer.current,
      style: "mapbox://styles/mapbox/streets-v11", // Mapbox style URL
      center: [0, 20], // [longitude, latitude]
      zoom: 1.5,
    });

    return () => map.remove(); // Clean up on unmount
  }, []);

  return <div ref={mapContainer} className="map-container"></div>;
};

export default Map;
