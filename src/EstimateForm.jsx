import React, { useState } from 'react';
import { Box, Typography, Select, MenuItem, FormControl, InputLabel, TextField } from '@mui/material';
import useGetDistance from './hooks/getDistance';
import useGetPorts from './hooks/getPorts';
import useGetFuelCost from './hooks/getFuelCost';
import useGetCargoCost from './hooks/getCargoCost';
import useGetBrokerCommission from './hooks/getBrokerCommission';
import useGetAddressCommission from './hooks/getAddressCommission';

const EstimateForm = () => {
  const { data: portsData, isLoading: portsLoading } = useGetPorts();

  const [departurePort, setDeparturePort] = useState('');
  const [arrivalPort, setArrivalPort] = useState('');

  const [cargoAmount, setCargoAmount] = useState('');
  const [cargoPrice, setCargoPrice] = useState('');

  const [brokerCommissionPercentage, setBrokerCommissionPercentage] = useState('');
  const [addressCommissionPercentage, setAddressCommissionPercentage] = useState('');

  const { data: distanceData, loading: distanceLoading, error: distanceError } = useGetDistance(departurePort, arrivalPort);
  const { data: fuelCostData } = useGetFuelCost(departurePort, arrivalPort);

  const parsedCargoAmount = parseFloat(cargoAmount);
  const parsedCargoPrice = parseFloat(cargoPrice);

  const isCargoAmountValid = !isNaN(parsedCargoAmount) && parsedCargoAmount >= 0;
  const isCargoPriceValid = !isNaN(parsedCargoPrice) && parsedCargoPrice >= 0;

  const { data: cargoCost, loading: cargoCostLoading, error: cargoCostError } = useGetCargoCost(
    isCargoAmountValid && isCargoPriceValid ? parsedCargoAmount : null,
    isCargoAmountValid && isCargoPriceValid ? parsedCargoPrice : null
  );

  const parsedBrokerCommissionPercentage = parseFloat(brokerCommissionPercentage);
  const parsedAddressCommissionPercentage = parseFloat(addressCommissionPercentage);

  const isBrokerCommissionPercentageValid =
    !isNaN(parsedBrokerCommissionPercentage) && parsedBrokerCommissionPercentage >= 0;
  const isAddressCommissionPercentageValid =
    !isNaN(parsedAddressCommissionPercentage) && parsedAddressCommissionPercentage >= 0;

  const {
    data: brokerCommissionData,
    loading: brokerCommissionLoading,
    error: brokerCommissionError,
  } = useGetBrokerCommission(
    isCargoAmountValid && isCargoPriceValid && isBrokerCommissionPercentageValid ? parsedCargoAmount : null,
    isCargoAmountValid && isCargoPriceValid && isBrokerCommissionPercentageValid ? parsedCargoPrice : null,
    isCargoAmountValid && isCargoPriceValid && isBrokerCommissionPercentageValid ? parsedBrokerCommissionPercentage : null
  );

  const {
    data: addressCommissionData,
    loading: addressCommissionLoading,
    error: addressCommissionError,
  } = useGetAddressCommission(
    isCargoAmountValid && isCargoPriceValid && isAddressCommissionPercentageValid ? parsedCargoAmount : null,
    isCargoAmountValid && isCargoPriceValid && isAddressCommissionPercentageValid ? parsedCargoPrice : null,
    isCargoAmountValid && isCargoPriceValid && isAddressCommissionPercentageValid ? parsedAddressCommissionPercentage : null
  );

  const handleDepartureChange = (event) => {
    setDeparturePort(event.target.value);
  };

  const handleArrivalChange = (event) => {
    setArrivalPort(event.target.value);
  };

  const calculateTotalCost = (fuelCost, cargoCost, brokerCommission, addressCommission) => {
    const costs = [fuelCost, cargoCost, brokerCommission, addressCommission];
    const validCosts = costs.filter((cost) => cost !== undefined && cost !== null);
    if (validCosts.length === 0) return null;
    return validCosts.reduce((total, cost) => total + cost, 0).toFixed(2);
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
              {/* Departure Port */}
              <FormControl fullWidth size="small">
                <InputLabel>Departure</InputLabel>
                <Select
                  value={departurePort}
                  label="Departure"
                  onChange={handleDepartureChange}
                  disabled={portsLoading}
                >
                  {portsData && portsData.map((port) => (
                    <MenuItem key={port.name} value={port.name}>
                      {port.name}
                    </MenuItem>
                  ))}
                </Select>
              </FormControl>

              {/* Arrival Port */}
              <FormControl fullWidth size="small">
                <InputLabel>Arrival</InputLabel>
                <Select
                  value={arrivalPort}
                  label="Arrival"
                  onChange={handleArrivalChange}
                  disabled={portsLoading}
                >
                  {portsData && portsData.map((port) => (
                    <MenuItem key={port.name} value={port.name}>
                      {port.name}
                    </MenuItem>
                  ))}
                </Select>
              </FormControl>
              <div></div>

              {/* Cargo Amount */}
              <TextField
                label="Cargo amount"
                variant="outlined"
                size="small"
                fullWidth
                value={cargoAmount}
                onChange={(e) => setCargoAmount(e.target.value)}
                type="number"
              />

              {/* Cargo Price */}
              <TextField
                label="Cargo price"
                variant="outlined"
                size="small"
                fullWidth
                value={cargoPrice}
                onChange={(e) => setCargoPrice(e.target.value)}
                type="number"
              />

              <div></div>
              {/* Address Commission Percentage */}
              <TextField
                label="Address commission (%)"
                variant="outlined"
                size="small"
                fullWidth
                value={addressCommissionPercentage}
                onChange={(e) => setAddressCommissionPercentage(e.target.value)}
                type="number"
              />

              {/* Broker Commission Percentage */}
              <TextField
                label="Broker commission (%)"
                variant="outlined"
                size="small"
                fullWidth
                value={brokerCommissionPercentage}
                onChange={(e) => setBrokerCommissionPercentage(e.target.value)}
                type="number"
              />
            </div>
          </Box>

          {/* Cost Summary */}
          <Box className="w-1/3 p-4 bg-yellow-100 rounded-lg">
            <Typography variant="subtitle2" className="text-gray-600">Voyage Summary</Typography>
            <Typography variant="body2" className="text-gray-600">
              {departurePort || 'Departure'} - {arrivalPort || 'Arrival'}
            </Typography>
            <div className="mt-4">
              {/* Display Distance */}
              {distanceLoading ? (
                <Typography variant="body2">Calculating distance...</Typography>
              ) : distanceError ? (
                <Typography variant="body2" color="error">Error fetching distance</Typography>
              ) : distanceData !== undefined ? (
                <>
                  <Typography variant="body2" className="flex justify-between">
                    <span>Distance</span>
                    <span>{distanceData ?? 0} km</span>
                  </Typography>
                  <hr className="my-4" />
                  {/* Fuel Cost */}
                  <Typography variant="body2" className="flex justify-between">
                    <span>Fuel cost</span>
                    <span>{fuelCostData ?? 0} $</span>
                  </Typography>
                  {/* Cargo Cost */}
                  <Typography variant="body2" className="flex justify-between">
                    <span>Cargo cost</span>
                    {cargoCostLoading ? (
                      <span>Calculating...</span>
                    ) : cargoCostError ? (
                      <span>Error</span>
                    ) : cargoCost !== null ? (
                      <span>{cargoCost} $</span>
                    ) : (
                      <span>0 $</span>
                    )}
                  </Typography>
                  {/* Broker Commission */}
                  <Typography variant="body2" className="flex justify-between">
                    <span>Broker commission</span>
                    {brokerCommissionLoading ? (
                      <span>Calculating...</span>
                    ) : brokerCommissionError ? (
                      <span>Error</span>
                    ) : brokerCommissionData !== null ? (
                      <span>{brokerCommissionData} $</span>
                    ) : (
                      <span>0 $</span>
                    )}
                  </Typography>
                  {/* Address Commission */}
                  <Typography variant="body2" className="flex justify-between">
                    <span>Address commission</span>
                    {addressCommissionLoading ? (
                      <span>Calculating...</span>
                    ) : addressCommissionError ? (
                      <span>Error</span>
                    ) : addressCommissionData !== null ? (
                      <span>{addressCommissionData} $</span>
                    ) : (
                      <span>0 $</span>
                    )}
                  </Typography>
                </>
              ) : (
                <Typography variant="body2">Select ports to calculate distance</Typography>
              )}
              <hr className="my-4" />
              {/* Total */}
              <Typography variant="body1" className="flex justify-between font-semibold">
                <span>Total</span>
                <span>
                  {calculateTotalCost(
                    fuelCostData,
                    cargoCost,
                    brokerCommissionData,
                    addressCommissionData
                  ) ?? 0} $
                </span>
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
