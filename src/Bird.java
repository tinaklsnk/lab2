public interface Bird {

    void fly();

    void sit();
}

class Predator extends Factory  {
    @Override
    public Bird getBird(String s) {
        System.out.println("Створено хижу пташку");
        switch (s)
        {
            case "Eagle":
                return new Eagle();
            case "Hawk":
                return new Hawk();
            case "Owl":
                return new Owl();
            case "Griffin":
                return new Griffin();
            default:
                return null;
        }
    }
    String [] species = {"Eagle", "Hawk", "Owl", "Griffin"};
}

class NonPredator extends Factory {
    @Override
    public Bird getBird(String s) {
        System.out.println("Створено нехижу пташку");
        switch (s)
        {
            case "Tit":
                return new Tit();
            case "Dove":
                return new Dove();
            case "Lark":
                return new Lark();
            case "Nightingale":
                return new Nightingale();
            default:
                return null;
        }
    }
    String [] species = {"Tit", "Dove", "Lark", "Nightingale"};
}

class Eagle  extends Predator implements Bird {
    @Override
    public void fly() {
        System.out.println("Орел літає");
    }

    @Override
    public void sit() {
        System.out.println("Орел сідає");
    }
    //Орел


}

class Hawk extends Predator implements Bird{
    @Override
    public void fly() {
        System.out.println("Яструб літає");
    }

    @Override
    public void sit() {
        System.out.println("Яструб сідає");
    }
    // Яструб
}

class Owl extends Predator implements Bird{
    @Override
    public void fly() {
        System.out.println("Сова літає");
    }

    @Override
    public void sit() {
        System.out.println("Сова сідає");
    }
    //Сова
}

class Griffin extends Predator implements Bird{
    @Override
    public void fly() {
        System.out.println("Гриф літає");
    }

    @Override
    public void sit() {
        System.out.println("Гриф сідає");
    }
    //Гриф
}

class Tit extends NonPredator implements Bird{
    @Override
    public void fly() {
        System.out.println("Синиця літає");
    }

    @Override
    public void sit() {
        System.out.println("Синиця сідає");
    }
    //Синиця
}

class Dove extends NonPredator implements Bird{
    @Override
    public void fly() {
        System.out.println("Голуб літає");
    }

    @Override
    public void sit() {
        System.out.println("Голуб сідає");
    }
    //Голуб
}

class Lark extends NonPredator implements Bird{
    @Override
    public void fly() {
        System.out.println("Жайворон літає");
    }

    @Override
    public void sit() {
        System.out.println("Жайворон сідає");
    }
    //Жайворон
}

class Nightingale extends NonPredator implements Bird{
    @Override
    public void fly() {
        System.out.println("Соловей літає");
    }

    @Override
    public void sit() {
        System.out.println("Соловей сідає");
    }
    //Соловей
}