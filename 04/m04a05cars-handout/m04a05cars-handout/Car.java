public class Car {
    public String brand;
    public String model;
    public String numberPlate;
    public String color;

    public Car(String brand, String model, String numberPlate, String color) {
        this.brand = brand;
        this.model = model;
        this.numberPlate = numberPlate;
        this.color = color;
    }

    @Override
    public String toString() {
        return brand + " " + model + ", " + color + " [" + numberPlate + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }

        Car other = (Car) obj;
        return brand.equals(other.brand) && model.equals(other.model) && numberPlate.equals(other.numberPlate) && color.equals(other.color);
    }

    public boolean alike(Car other) {
        return brand.equals(other.brand) && model.equals(other.model) && color.equals(other.color);
    }
}
