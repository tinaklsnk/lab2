import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {
    public static List<Bird> birds = new ArrayList<>();
    public static List<Bird> predatorBirds = new ArrayList<>();
    public static String [] factoryTypes = {"Predator", "NonPredator"};
    public static String [] predators = {"Eagle", "Hawk", "Owl", "Griffin"};
    public static String [] nonPredators = {"Tit", "Dove", "Lark", "Nightingale"};
    public static void main(String[] args) {
        add();
        birdsFly();
    }

    public static void birdsFly() {
        for (Bird b: birds) {
            b.fly();
        }
    }

    public static void birdsSit() {
        for (Bird b: birds) {
            b.sit();
        }
    }

    public static void add() {
        int random = generateRandomInt(factoryTypes.length);
        Factory factory = new FactoryProducer().getFactory(factoryTypes[random]);
        if (factoryTypes[random].equals("Predator")) {
            //factory = new Predator();
            int rand = generateRandomInt(predators.length);
            Bird b = factory.getBird(predators[rand]);
            predatorBirds.add(b);
            b.fly();
        }
        else if (factoryTypes[random].equals("NonPredator")) {
            //factory = new NonPredator();
            int rand = generateRandomInt(nonPredators.length);
            Bird b = factory.getBird(nonPredators[rand]);
            birds.add(b);
            b.fly();
        }
        System.out.println(birds);
    }

    public static int generateRandomInt(int upperRange){
        Random random = new Random();
        return random.nextInt(upperRange);
    }
}

class FactoryProducer {
    public Factory getFactory(String factoryType) {
        switch (factoryType)
        {
            case "Predator":
                System.out.println("Фабрика хижих");
                return new Predator();
            case "NonPredator":
                System.out.println("Фабрика нехижих");
                return new NonPredator();
            default:
                return null;
        }
    }
}

abstract class Factory {
    abstract Bird getBird(String species);
}

