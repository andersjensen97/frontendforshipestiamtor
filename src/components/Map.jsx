import React from 'react';
import { MapContainer, Marker, Popup, TileLayer } from "react-leaflet";
import "leaflet/dist/leaflet.css";
import ToIcon from "../ToIcon.png";
import { Icon } from 'leaflet';

const Map = ({
  departurePortName,
  departurePortLongitude,
  departurePortLatitude,
  arrivalPortName,
  arrivalPortLongitude,
  arrivalPortLatitude
}) => {
    
   // Creating a custom icon for the "to" marker
   const customToIcon = new Icon({
    iconUrl: ToIcon,
    iconSize: [50, 50],
  });

  return (
    <div className="flex flex-1 3xl:w-[1000px] 3xl:h-[400px] 2xl:w-[600px] 2xl:h-[500px] xl:w-[400px] xl:h-[300] lg:w-[300px] lg:h-[300] md:w-[200px] md:h-[1500] sm:w-[400px] sm:h-[300px]">
      <MapContainer
         center={[20, 30]}
         zoom={2}
         style={{ height: "100%", width: "100%" }}
      >
        <TileLayer url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png" />
        {departurePortLatitude && departurePortLongitude && (
          <Marker
            position={[departurePortLatitude, departurePortLongitude]}
            icon={customToIcon}
          >
            <Popup>
              <div className="flex flex-row content-center items-center gap-2">
                <p className="font-bold"> Departure:</p>
                {departurePortName}
              </div>
            </Popup>
          </Marker>
        )}
        {arrivalPortLatitude && arrivalPortLongitude && (          
          <Marker
            position={[arrivalPortLatitude, arrivalPortLongitude]}
            icon={customToIcon}
            >
            <Popup>
              <div className="flex flex-row content-center items-center gap-2">
                <p className="font-bold"> Arrival:</p>
                {arrivalPortName}
              </div>
            </Popup>
          </Marker>
        )}
      </MapContainer>
    </div>
  );
};

export default Map;
