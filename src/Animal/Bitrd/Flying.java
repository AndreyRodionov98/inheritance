package Animal.Bitrd;

import java.util.Objects;

public  class Flying extends Bird {
    private String typeOfMovement;

    public Flying(String typeOfMovement,String home, String name, int birthYear) {
        super(home, name, birthYear);
        this.typeOfMovement=typeOfMovement;
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(typeOfMovement, flying.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMovement);
    }
    public static void walk(){
        System.out.println("fly");
    }
    public void hunt(){
        System.out.println(" ест  рыбу ");
    }

    @Override
    public String toString() {
        return "кличка - " +getName()+
                ", возраст - " +getBirthYear()+", место обитания - "+ getHome()+
                ", тип передвижения - "+getTypeOfMovement() ;
    }
}
