package Animal.Bitrd;

import java.util.Objects;

public class NotFlying extends Bird {
    private String typeOfMovement;


    public NotFlying(String typeOfMovement,String home, String name, int birthYear) {
        super(home, name, birthYear);
        this.typeOfMovement = typeOfMovement;
    }


    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotFlying notFlying = (NotFlying) o;
        return Objects.equals(typeOfMovement, notFlying.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfMovement);
    }
    public  void walk(){
        System.out.println("run");
    }
    public void hunt(){
        System.out.println(" ест траву и насекомых");
    }

    @Override
    public String toString() {
        return "кличка - " +getName()+
                ", возраст - " +getBirthYear()+", место обитания - "+ getHome()+
                ", тип передвижения - "+getTypeOfMovement() ;
    }
}
