package Transport;

import java.util.PrimitiveIterator;

public abstract class Transport {
    private String brand;
    private  String model;
    private int year;
    private String country;
    private  String color;
    private int maxSpeed;
    protected double fuelPercentage;
    public Transport(String brand, String model, int year, String country, String color, int maxSpeed, double fuelPercentage) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }

        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "default";
        } else {
            this.country = country;
        }

        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = " белый ";
        } else {
            this.color = color;
        }

        this.maxSpeed = maxSpeed;
        if (fuelPercentage == 0.0) {
            this.fuelPercentage = 100.00;
        } else {
            this.fuelPercentage = fuelPercentage;
        }
    }


    public double getFuelPercentage() {
        return fuelPercentage;
    }

    public void setFuelPercentage(double fuelPercentage) {
        this.fuelPercentage = fuelPercentage;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
   }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color==null||color.isBlank()||color.isEmpty()) {
            this.color = "white";
        }
        else {
            this.color=color;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed == 0) {
            this.maxSpeed = 180;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }


    public abstract void  refill() ;
}



































