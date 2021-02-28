public class Program {
    public static void main(String[] args) {

    }
}

interface Bird {
    void fly();
    void sit();
}

class Predator implements Bird{
    @Override
    public void fly() {
        System.out.println(" Хижа літає");
    }

    @Override
    public void sit() {
        System.out.println("Хижа сіла");
    }
}

class NonPredatory implements Bird {
    @Override
    public void fly() {
        System.out.println("Нехижа літає");
    }

    @Override
    public void sit() {
        System.out.println("Нехижа сіла");
    }
}

 abstract class Factory {
    abstract void getBird();
}

class FactoryProducer {
    public static Bird getFactory() {
        int r=0;
        switch (r) {
            case 0:
                return new Predator();
            case 1:
                return new NonPredatory();
            default:
                return null;
        }
    }
}
