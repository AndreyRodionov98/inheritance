package Transport;

public class Bus extends Transport {
    public Bus(String brand, String model, int year, String country, String color, int maxSpeed,double fuelPercentage) {
        super( brand,  model,  year,  country,  color,  maxSpeed,  fuelPercentage);
    }

    @Override
    public void refill() {
        System.out.println(" можно заправлять бензином или дизелем на заправке"+getFuelPercentage());
    }

    @Override
    public String toString() {
        return "автобус - " + getBrand()  +
                ", модель-  " + getModel()  +
                ", " + getYear()+
                " год выпуска, сборка в " + getCountry() +" "+
                getColor() +" цвета "+" максимальная скорость передвижения - "+getMaxSpeed();
    }

}
