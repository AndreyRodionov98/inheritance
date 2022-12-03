import Animal.Mammal.Herbivore;
import Transport.Bus;
import Transport.Car;
import Transport.Train;
import Animal.Mammal.Herbivore;
import Animal.Mammal.Predator;
import Animal.Mammal.Mammal;
import Animal.Animal;
import Animal.Amphibian;
import Animal.Bitrd.Bird;
import Animal.Bitrd.Flying;
import Animal.Bitrd.NotFlying;
import org.w3c.dom.ls.LSOutput;

public class Main {


    public static void main(String[] args) {

        Car Lada = new Car(" Lada", "Granta", 2015, "России ", "желтого", 1.7, "автоматическая", " седан ", "x111xe777", 2, "летняя", new Car.Key(), new Car.Insurance(), 180, 100.00);
        System.out.println(Lada.toString());
        Lada.refill();
        Car Audi = new Car(" Audi", "A8 50 L TDI quattro", 2020, "Германии ", "черный", 3.0, "механическая", "купе", "x121xe797", 4, "зимняя", new Car.Key(), new Car.Insurance(), 240, 90.98);
        Audi.refill();
        System.out.println(Audi.toString());
        Car BMW = new Car(" BMW", "Z8", 2021, "Германии", "черный ", 3.0, "автоматическая", "седан", "x351xy136", 2, "летняя", new Car.Key(), new Car.Insurance(), 240, 40.00);
        BMW.refill();
        System.out.println(BMW.toString());
        Car Kia = new Car(" Kia", "Sportage", 2018, "Южной Корее", "красный", 2.4, "механическая", "купе", "x1545oe199", 7, "зимняя", new Car.Key(), new Car.Insurance(), 240, 50.00);
        Kia.refill();
        System.out.println(Kia.toString());
        Car Hyundai = new Car(" Hyundai", "Avante", 2016, "Южной Корее", "оранжевый", 1.6, "автоматическая", "купе", "x777ka131", 4, "", new Car.Key(), new Car.Insurance(), 200, 65.00);
        Hyundai.refill();
        System.out.println(Hyundai.toString());
        System.out.println("=========================");

        Train Bird = new Train(" 3500", " ", "Белорусский вокзал", "Минск-Пассажирский ", 11, "Ласточка", "B-901",
                2011, "Россия", " ", 301, 54.54);
        System.out.println(Bird.toString());
        Bird.refill();


        Train City = new Train(" 1700", " ", "Ленинградский вокзал ",
                "Ленинград-Пассажирский ", 8, "Ленинград", "D-125",
                2019, "Россия", " ", 270, 67.00);
        System.out.println(City.toString());
        City.refill();

        System.out.println("=========================");

        Bus First = new Bus("Мерседес ", "GLD-233", 2018, "Германия ", " черный", 90, 10.00);
        System.out.println(First.toString());
        First.refill();
        Bus Second = new Bus("Хонда ", "AWD-211", 2009, "Япония ", " серый", 110, 67.65);
        System.out.println(Second.toString());
        Second.refill();
        Bus Third = new Bus("LADA ", "GLD-233", 2000, "Россия ", " ", 70, 23.43);
        System.out.println(Third.toString());
        Third.refill();

        System.out.println("=========================");


        Herbivore Giraff = new Herbivore("Giraff", 11, "трава","Africa",25);
        System.out.println(Giraff.toString());
        Herbivore.graze();
        Herbivore.walk();
        Giraff.eat();
        Giraff.go();
        Giraff.sleep();
        Herbivore Gazelle=new Herbivore("Газ",9,"трава","",50);
        System.out.println(Gazelle.toString());
        Herbivore.graze();
        Herbivore.walk();
        Gazelle.go();
        Gazelle.eat();
        Gazelle.sleep();
        Gazelle.getHome();
        Herbivore Horse=new Herbivore("",4,"трава","степь",40);
        System.out.println(Horse.toString());
        Herbivore.walk();
        Herbivore.graze();
        Horse.eat();
        Horse.go();
        Horse.sleep();
        Horse.getHome();


        Predator Hyena=new Predator("",10,"падаль","Africa",45);
        System.out.println(Hyena.toString());
        Predator.hunt();
        Predator.walk();
        Hyena.eat();
        Hyena.go();
        Hyena.sleep();
        Predator Tiger=new Predator("тигр",15,"животные","европа",50);
        System.out.println(Tiger.toString());
        Predator.hunt();
        Predator.walk();
        Tiger.go();
        Tiger.eat();
        Tiger.sleep();
        Predator Bear=new Predator("",9,"всеядный","",45);
        Bear.hunt();
        Bear.walk();
        Bear.sleep();
        Bear.eat();
        Bear.go();

        Amphibian Frog= new Amphibian("лягушка ",2,"не засушливые места ");
        System.out.println(Frog.toString());
        Frog.eat();
        Frog.go();
        Frog.sleep();
        Frog.hunt();
        Amphibian Snake= new Amphibian("змейка ",2,"не засушливые места ");
        System.out.println(Snake.toString());
        Snake.go();
        Snake.eat();
        Snake.sleep();
        Snake.hunt();


        NotFlying Peacock=new NotFlying("НАСЕКОМЫЕ", "S", "PEACOCK", 12) ;
        System.out.println(Peacock.toString());
        Peacock.go();
        Peacock.eat();
        Peacock.sleep();
        Peacock.hunt();
        Peacock.walk();
        NotFlying Penguin=new NotFlying("fish","north","penguin",3);
        System.out.println(Penguin.toString());
        Penguin.sleep();
        Penguin.eat();
        Penguin.go();
        Penguin.walk();
        Penguin.hunt();
        NotFlying Dodo=new NotFlying("","","",3) ;
        System.out.println(Dodo.toString());
        Dodo.eat();
        Dodo.walk();
        Dodo.go();
        Dodo.sleep();
        Dodo.hunt();


        Flying Seagull=new Flying("fish","earth","",4);
        System.out.println(Seagull.toString());
        Seagull.go();
        Seagull.eat();
        Seagull.sleep();
        Seagull.hunt();
        Seagull.walk();
        Flying Albatross=new Flying("fish","sea","albatross",5);
        System.out.println(Albatross.toString());
        Albatross.hunt();
        Albatross.eat();
        Albatross.go();
        Albatross.sleep();
        Albatross.walk();
        Flying Falcon=new Flying("","","",6);
        System.out.println(Falcon.toString());
        Falcon.go();
        Falcon.eat();
        Falcon.hunt();
        Falcon.sleep();
        Falcon.walk();















    }
}