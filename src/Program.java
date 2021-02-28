public class Program {
    public static void main(String[] args) {

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
