package Animal;

import java.util.Objects;

public  class Amphibian extends Animal {
    private String home;

    public Amphibian(String name,int birthYear,String home) {
        super(name,birthYear);
        this.home = home;

    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amphibian amphibian = (Amphibian) o;
        return Objects.equals(home, amphibian.home);
    }

    @Override
    public int hashCode() {
        return Objects.hash(home);
    }
    public  void hunt(){
        System.out.println("охотятся");
    }
    public void eat(){
        System.out.println("кушает червей ");

    }
    public  void sleep(){
        System.out.println("спят 6 часов");
    }
    public  void go(){
        System.out.println("ползают");
    }

    @Override
    public String toString() {
        return "кличка - " +getName()+
                ", возраст - " +getBirthYear()+", место обитания - "+ home ;
    }
}

