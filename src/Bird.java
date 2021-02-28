public interface Bird {

    void fly();

    void sit();
}

class Predator implements Bird {
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

class Eagle {
    //Орел
}

class Hawk {
    // Яструб
}

class Owl {
    //Сова
}

class Griffin {
   //Гриф
}

class Tit {
    //Синиця
}

class Dove {
    //Голуб
}

class Lark {
    //Жайворон
}

class Nightingale {
    //Соловей
}