import React, { useState, useEffect } from 'react';
import { Autocomplete, Box, TextField, Typography, Select, MenuItem } from '@mui/material';
import {useCargoData, useEstimateData, usePortData, useVesselData} from './/fetchdata/api.js'

const EstimateForm = () => {

    const { vessel, errorVes } = useVesselData();
    const [selectedVessel, setSelectedVessel] = useState('');

    const handleVesselChange = (event) => {
        setSelectedVessel(event.target.value);
    };

    const { port, errorPort } = usePortData();
    const [selectedPort, setSelectedPort] = useState('');

    const handlePortChange = (event) => {
        setSelectedPort(event.target.value);
    };

  return (
    <div className="flex flex-col items-center p-8 bg-gray-100 min-h-screen">
      {/* Main container */}
      <div className="w-full max-w-4xl">
        {/* Form and Summary Section */}
        <div className="flex gap-4 mb-6">
          
          {/* Input Form */}
          <Box className="w-2/3 p-4 bg-blue-100 rounded-lg">
            <div className="grid grid-cols-3 gap-4">
              {/* Departure port Type Dropdown */}
              <Autocomplete value={selectedPort}onChange={(event, newValue) => handlePortChange(newValue)}options={port.map((v) => v.name)} renderInput={(params) => (
                <TextField {...params} label="Select Depature Port" variant="outlined" fullWidth size="small" /> )}
                isOptionEqualToValue={(option, value) => option === value} // Ensures correct option matching
                getOptionLabel={(option) => option} // Display option as plain text
                disableClearable // Remove the clear button (optional)
                size="small"
              />
              {/* Arrival port Type Dropdown */}
              <Autocomplete value={selectedPort}onChange={(event, newValue) => handlePortChange(newValue)}options={port.map((v) => v.name)} renderInput={(params) => (
                <TextField {...params} label="Select Arrival Port" variant="outlined" fullWidth size="small" /> )}
                isOptionEqualToValue={(option, value) => option === value} // Ensures correct option matching
                getOptionLabel={(option) => option} // Display option as plain text
                disableClearable // Remove the clear button (optional)
                size="small"
              />
              {/* Vessel Type Dropdown */}
              <Autocomplete value={selectedVessel}onChange={(event, newValue) => handleVesselChange(newValue)}options={vessel.map((v) => v.name)} renderInput={(params) => (
                <TextField {...params} label="Select Vessel Type" variant="outlined" fullWidth size="small" /> )}
                isOptionEqualToValue={(option, value) => option === value} // Ensures correct option matching
                getOptionLabel={(option) => option} // Display option as plain text
                disableClearable // Remove the clear button (optional)
                size="small"
              />
              <TextField label="Type of fuel" variant="outlined" size="small" fullWidth />
              <TextField label="Weight" variant="outlined" size="small" fullWidth />
            </div>
          </Box>

          {/* Cost Summary */}
          <Box className="w-1/3 p-4 bg-yellow-100 rounded-lg">
            <Typography variant="subtitle2" className="text-gray-600">From To</Typography>
            <Typography variant="body2" className="text-gray-600">Departure Arrival</Typography>
            <div className="mt-4">
              <Typography variant="body2" className="flex justify-between">
                <span>Type of vessel</span>
                <span>0000$</span>
              </Typography>
              <Typography variant="body2" className="flex justify-between">
                <span>Type of fuel</span>
                <span>0000$</span>
              </Typography>
              <Typography variant="body2" className="flex justify-between">
                <span>Weight</span>
                <span>0000$</span>
              </Typography>
              <hr className="my-4" />
              <Typography variant="body1" className="flex justify-between font-semibold">
                <span>Total</span>
                <span>0000$</span>
              </Typography>
            </div>
          </Box>
        </div>

        {/* Map Section */}
        <Box className="h-64 bg-gray-300 rounded-lg flex items-center justify-center">
          <Typography variant="h6" className="text-gray-500">Map</Typography>
        </Box>
      </div>
    </div>
  );
};

export default EstimateForm;
