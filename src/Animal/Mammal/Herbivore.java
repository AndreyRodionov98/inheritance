package Animal.Mammal;

import java.util.Objects;

public  class Herbivore extends Mammal {
    private String typeOfFood;

    public Herbivore(String name,int birthYear,String typeOfFood,String home, int speed) {
        super(name,birthYear,home, speed);
        if (typeOfFood==null||typeOfFood.isEmpty()||typeOfFood.isBlank()){
            this.typeOfFood="трава";
        }
        else {
            this.typeOfFood = typeOfFood;
        }
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivore herbivore = (Herbivore) o;
        return Objects.equals(typeOfFood, herbivore.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    public static void walk(){
        System.out.println("ходят в поисках пищи");
    }

    public static void graze(){
        System.out.println("пасутся");
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public  void go() {
        super.go();
    }

    @Override
    public String toString() {
        return "Кличка -" +getName()+",  возраст - "+getBirthYear()+
                ",  тип еды - " + typeOfFood + ", место обитания -  "+getHome()+
                ", скорость передвижения - "+getSpeed()+"км/ч" ;
    }
}
