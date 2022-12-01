package Animal;

import java.util.Objects;

public abstract class Animal {
    private String name;
    private int birthYear;

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;

    }

    public void setName(String name) {
        name = name;
    }

    public Animal(String name, int birthYear) {
        if (name==null||name.isBlank()||name.isEmpty()){
            this.name="animal";
        }else{
            this.name = name;
        }
        if (birthYear==0){
            this.birthYear=1;
        }else {
        this.birthYear = birthYear;
    }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return birthYear == animal.birthYear && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthYear);
    }
    public abstract void eat();

    public void sleep() {
    }

    public void go() {
    }

}
