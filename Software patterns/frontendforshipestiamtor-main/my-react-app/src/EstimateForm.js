
import React from "react";
import Map from "./Map";
import "./EstimateForm.css"; // Add CSS if needed

const EstimateForm = () => {
  return (
    <div className="estimate-form">
      <div className="form-container">
        <div className="input-fields">
          <input placeholder="Departure" className="input" />
          <input placeholder="Arrival" className="input" />
          <input placeholder="Type of vessel" className="input" />
          <input placeholder="Type of fuel" className="input" />
          <input placeholder="Weight" className="input" />
        </div>
        <div className="summary-container">
          <h4>From To</h4>
          <div>Departure Arrival</div>
          <div>Type of vessel: 0000$</div>
          <div>Type of fuel: 0000$</div>
          <div>Weight: 0000$</div>
          <h3>Total: 0000$</h3>
        </div>
      </div>
      <Map />
      <div className="additional-info">
        <h4>Additional Information</h4>
        <p>Some extra details can go here.</p>
      </div>
    </div>
  );
};

export default EstimateForm;
