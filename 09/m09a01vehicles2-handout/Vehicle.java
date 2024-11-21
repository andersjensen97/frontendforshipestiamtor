public abstract class Vehicle {
    private String model;
    private String registrationPlate;

    public Vehicle(String model, String registrationPlate) {
        this.model = model;
        this.registrationPlate = registrationPlate;
    }

    public abstract int getPassengerCapacity();
    public abstract double getCargoCapacity();

    public String getModel() {
        return model;
    }

    public String getRegistrationPlate() {
        return registrationPlate;
    }
}

class Minivan extends Vehicle {
    private int passengerCapacity;

    public Minivan(String model, String registrationPlate, int passengerCapacity) {
        super(model, registrationPlate);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    @Override
    public double getCargoCapacity() {
        return 0;
    }
}

class Truck extends Vehicle {
    private double cargoCapacity;

    public Truck(String model, String registrationPlate, double cargoCapacity) {
        super(model, registrationPlate);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public int getPassengerCapacity() {
        return 0;
    }

    @Override
    public double getCargoCapacity() {
        return cargoCapacity;
    }
}
