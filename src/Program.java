import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static List<Bird> predatorBirds = new ArrayList<>();
    public static List<Bird> birds = new ArrayList<>();
    public static String [] factoryTypes = {"Predator", "NonPredator"};
    public static String [] predators = {"Eagle", "Hawk", "Owl", "Griffin"};
    public static String [] nonPredators = {"Tit", "Dove", "Lark", "Nightingale"};
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            addBird();
            birdsFly();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void birdsFly() {
        for (Bird b: birds) {
            b.fly();
        }
    }

    public static void addBird() {
        int random = generateRandomInt(factoryTypes.length);
        Factory factory = new FactoryProducer().getFactory(factoryTypes[random]);
        if (factoryTypes[random].equals("Predator")) {
            int rand = generateRandomInt(predators.length);
            Bird b = factory.getBird(predators[rand]);
            predatorBirds.add(b);
            b.fly();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            b.sit();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else if (factoryTypes[random].equals("NonPredator")) {
            int rand = generateRandomInt(nonPredators.length);
            Bird b = factory.getBird(nonPredators[rand]);
            birds.add(b);
        }
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

