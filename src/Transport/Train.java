package Transport;

public class Train extends Transport {
    private String priceTrip;
    private String timeTrip;
    private String stationName;
    private String finalStop;
    private  int numberOfTrain;

    public String getPriceTrip() {
        return priceTrip;
    }

    public void setPriceTrip(String priceTrip) {
        this.priceTrip = priceTrip;
    }

    public String getTimeTrip() {
        return timeTrip;
    }

    public void setTimeTrip(String timeTrip) {
        this.timeTrip = timeTrip;
    }

    public int getNumberOfTrain() {
        return numberOfTrain;
    }

    public void setNumberOfTrain(int numberOfTrain) {
        this.numberOfTrain = numberOfTrain;
    }

    public String getStationName() {
        return stationName;
    }

    public String getFinalStop() {
        return finalStop;
    }

    public Train(String priceTrip, String timeTrip, String stationName, String finalStop, int numberOfTrain,
                 String brand, String model, int year, String country, String color, int maxSpeed,double fuelPercentage) {
        super( brand,  model,  year,  country,  color,  maxSpeed, fuelPercentage);
       if (priceTrip==null||priceTrip.isEmpty()||priceTrip.isBlank()) {
           this.priceTrip = "не указанна";
       }
       else{
           this.priceTrip=priceTrip;
       }
       if (timeTrip==null||timeTrip.isBlank()||timeTrip.isEmpty()){
        this.timeTrip="не указанно";
       }else {
           this.timeTrip = timeTrip;
       }
        this.stationName = stationName;
        this.finalStop = finalStop;
        this.numberOfTrain = numberOfTrain;
    }

    @Override
    public String toString() {
        return
                "цена поездки -" + priceTrip  +
                ", время пути " + timeTrip   +
                ", название  начальной станции " + stationName  +
                ", конечная станция -" + finalStop  +
                ", количество вагонов - " + numberOfTrain+ ", поезд- "+getBrand()  +
                        ", модель - " + getModel()  +
                        ", " +
                        "" + getYear()+
                        " год выпуска, сборка в " + getCountry() +", цвет -  "+
                        getColor();
    }

    @Override
    public void refill() {
        System.out.println("нужно заправлять дизелем "+getFuelPercentage());
    }
}
