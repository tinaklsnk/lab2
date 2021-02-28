public class Program {
    public static void main(String[] args) {

    }
}

class FactoryProducer {
    public Factory getFactory(String factoryType) {
        switch (factoryType)
        {
            case "Predator":
                return new Predator();
            case "Non-Predator":
                return new NonPredator();
            default:
                return null;
        }
    }
}

abstract class Factory {
    abstract Bird getBird(String species);
}

