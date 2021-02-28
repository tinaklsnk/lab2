public interface Bird {

    void fly();

    void sit();
}

class Predator extends Factory  {
    @Override
    public Bird getBird(String s) {
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
}

class NonPredator extends Factory {
    @Override
    public Bird getBird(String s) {
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
}

class Eagle implements Bird{
    @Override
    public void fly() {

    }

    @Override
    public void sit() {

    }
    //Орел

}

class Hawk implements Bird{
    @Override
    public void fly() {

    }

    @Override
    public void sit() {

    }
    // Яструб
}

class Owl implements Bird{
    @Override
    public void fly() {

    }

    @Override
    public void sit() {

    }
    //Сова
}

class Griffin implements Bird{
    @Override
    public void fly() {

    }

    @Override
    public void sit() {

    }
    //Гриф
}

class Tit implements Bird{
    @Override
    public void fly() {

    }

    @Override
    public void sit() {

    }
    //Синиця
}

class Dove implements Bird{
    @Override
    public void fly() {

    }

    @Override
    public void sit() {

    }
    //Голуб
}

class Lark implements Bird{
    @Override
    public void fly() {

    }

    @Override
    public void sit() {

    }
    //Жайворон
}

class Nightingale implements Bird{
    @Override
    public void fly() {

    }

    @Override
    public void sit() {

    }
    //Соловей
}