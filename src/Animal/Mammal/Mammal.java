package Animal.Mammal;

import Animal.Animal;

import java.util.Objects;

public abstract class Mammal extends Animal {
    private String home;
    private int speed;

    public Mammal(String name,int birthYear,String home, int speed) {
        super(name, birthYear);
        if (home == null || home.isEmpty() || home.isBlank()) {
            this.home = "природа";
        } else {
            this.home = home;
        }
        if (speed == 0) {
            this.speed = 25;
        } else {
            this.speed = speed;
        }
    }

    public String getHome() {
        return home;
    }

    public int getSpeed() {
        return speed;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public static void walk() {
    }
    public void eat(){
        System.out.println("кушают  траву и мясо");

    }
    public void sleep(){
        System.out.println("спят 8 часов");
    }
    public   void go(){
        System.out.println("ходят");
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mammal mammal = (Mammal) o;
        return speed == mammal.speed && Objects.equals(home, mammal.home);
    }

    @Override
    public int hashCode() {
        return Objects.hash(home, speed);
    }
}
