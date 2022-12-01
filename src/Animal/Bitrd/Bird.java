package Animal.Bitrd;

import Animal.Animal;

import java.util.Objects;

public abstract class Bird  extends Animal {
    private String home;

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
        Bird bird = (Bird) o;
        return Objects.equals(home, bird.home);
    }

    @Override
    public int hashCode() {
        return Objects.hash(home);
    }

    public Bird(String home,String name,int birthYear) {
        super(name,birthYear);
        this.home = home;
    }
    public abstract void hunt();
    public void eat(){
        System.out.println("кушают  насекомых");

    }
    public void sleep(){
        System.out.println("спят 4 часа");
    }
    public void go(){
        System.out.println("летают");
    }


}



