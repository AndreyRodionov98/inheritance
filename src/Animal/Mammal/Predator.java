package Animal.Mammal;

import java.util.Objects;

public  class Predator extends Mammal {
    private String typeOfFood;

    public Predator(String name, int birthYear, String typeOfFood, String home, int speed) {
        super(name, birthYear, home, speed);
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
        Predator predator = (Predator) o;
        return Objects.equals(typeOfFood, predator.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfFood);
    }

    public static void walk() {
        System.out.println("ходят на своей территории");
    }

    public static void hunt() {
        System.out.println("охотятся");
    }

    @Override
    public void go() {
        super.go();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public String toString() {
        return "Кличка - " + getName() + "возраст - " + getBirthYear() +
                ", тип еды - " + typeOfFood + ", место обитания - " + getHome() +
                ", скорость передвижения - " + getSpeed()+" км/ч " ;
    }
}
