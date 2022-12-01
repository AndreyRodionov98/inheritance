package Transport;

import java.time.LocalDate;

public class Car extends Transport {
    private double engineVolume;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private String summerOrWinterTires;
    private Key key;

    private Insurance  insurance;

    @Override
    public void refill() {
        System.out.println("  можно заправлять бензином, дизелем на заправке или заряжать на специальных электропарковках, если это электрокар"+getFuelPercentage());
    }

    public static class Key{
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;



        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;

        }
        public Key(){
            this(false,false);
        }
        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }
    public static class Insurance {
        private final LocalDate validityOfInsurance;
        private final double costOfInsurance;
        private final String numberOfInsurance;

        public Insurance(LocalDate validityOfInsurance, double costOfInsurance, String numberOfInsurance) {
            if (validityOfInsurance == null) {
                this.validityOfInsurance = LocalDate.now().plusDays(365);
            } else {
                this.validityOfInsurance = validityOfInsurance;
            }
            this.costOfInsurance = costOfInsurance;
            if (numberOfInsurance == null) {
                this.numberOfInsurance = "123456789";
            } else {

                this.numberOfInsurance = numberOfInsurance;
            }
        }

        public LocalDate getValidityOfInsurance() {
            return validityOfInsurance;
        }

        public double getCostOfInsurance() {
            return costOfInsurance;
        }

        public String getNumberOfInsurance() {
            return numberOfInsurance;
        }
        public void chekValidityOfInsurance(){
            if (validityOfInsurance.isBefore(LocalDate.now())||validityOfInsurance.isEqual(LocalDate.now())){
                System.out.println("нужно срочно ехать оформлять новую страховку");

            }
        }
        public void chekNumber(){
            if (numberOfInsurance.length()!=9){
                System.out.println("номер страховки некорректный");

            }
        }
        public Insurance(){
            this(null,10000,null);
        }


    }




    public Car(String brand,String model, int year, String country,
               String color, double engineVolume, String transmission,
               String bodyType, String registrationNumber, int numberOfSeats,
               String summerOrWinterTires,Key key,Insurance insurance,int maxSpeed,double fuelPercentage) {
        super(brand,  model,  year,  country,  color,  maxSpeed, fuelPercentage);

        if (transmission==null||transmission.isBlank()||transmission.isEmpty()){
            this.transmission="default";
        }
        else {
            this.transmission=transmission;
        }
        if (bodyType==null||bodyType.isEmpty()||bodyType.isBlank()){
            this.bodyType="default";
        }
        else {
            this.bodyType=bodyType;
        }
        if (registrationNumber==null||registrationNumber.isEmpty()||registrationNumber.isBlank()){
            this.registrationNumber="проверка правильности написания номера авто (х000хх000)";
        }
        else {
            this.registrationNumber=registrationNumber;
        }
        if (numberOfSeats<2){
            this.numberOfSeats=2;
        }
        else {
            this.numberOfSeats=numberOfSeats;
        }
        if (summerOrWinterTires==null||summerOrWinterTires.isBlank()||summerOrWinterTires.isEmpty()){
            this.summerOrWinterTires="сменить шины на сезонные";
        }
        else{
            this.summerOrWinterTires=summerOrWinterTires;
        }

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (key==null){
            this.key=new Key();
        }
        else {
            this.key=key;
        }
        if (insurance==null){
            this.insurance=new Insurance();
        }
        else {
            this.insurance=insurance;
        }


    }



    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }







    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }
    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getSummerOrWinterTires() {
        return summerOrWinterTires;
    }

    @Override
    public String toString() {
        return
                "" + getBrand()  +
                        " " + getModel()  +
                        "," + getYear()+
                        " год выпуска, сборка в " + getCountry() +" "+
                        getColor() +" цвета "+
                        ", объем двигателя- " + engineVolume +
                        " л.,"+" коробка передач -"+transmission+", "+
                        " тип  кузова - "+ bodyType+", регистрационный номер - "+
                        registrationNumber+", количество мест -  "+ numberOfSeats+
                        ", тип резины - "+summerOrWinterTires+ ", "+(getKey().remoteEngineStart?"обычный":"дистанционный"+" запуск, ")+
                        " "+(getKey().keylessAccess?", ключевой":"безключевой"+"доступ")+", "+
                        " " + (" срок действия страховки"+getInsurance().validityOfInsurance)
                        +(", номер страховки "+getInsurance().numberOfInsurance)
                        +", стоимость страховки "+getInsurance().costOfInsurance+", максимальная скорость -"+getMaxSpeed()+" км/ч";
    }



}


