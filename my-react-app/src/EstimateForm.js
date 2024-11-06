import React, { useState, useEffect } from 'react';
import { Box, TextField, Typography, Select, MenuItem } from '@mui/material';
import {useCargoData, useEstimateData, usePortData, useVesselData} from './/fetchdata/api.js'

const EstimateForm = () => {

    const { vessel, error } = useVesselData();
    const [selectedVessel, setSelectedVessel] = useState('');

    const handleVesselChange = (event) => {
        setSelectedVessel(event.target.value);
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
              <TextField label="Departure" variant="outlined" size="small" fullWidth />
              <TextField label="Arrival" variant="outlined" size="small" fullWidth />
               {/* Vessel Type Dropdown */}
               <Select value={selectedVessel}onChange={handleVesselChange}displayEmpty fullWidth variant="outlined" size="small">
                  <MenuItem value="" disabled>
                    Select Vessel Type
                  </MenuItem>
                    {vessel.map((v) => (
                      <MenuItem key={v.id} value={v.name}>{v.name}</MenuItem>
                    ))}
                </Select>
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
