import React from 'react';
import { TextField, Box, Typography } from '@mui/material';

const EstimateForm = () => {
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
              <TextField label="Type of vessel" variant="outlined" size="small" fullWidth />
              <TextField label="Type of fuel" variant="outlined" size="small" fullWidth />
              <TextField label="Weight" variant="outlined" size="small" fullWidth />
              <div />
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
