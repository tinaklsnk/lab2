import java.util.ArrayList;
import java.util.List;

public interface Bird {

    void fly();

    void sit();
}

class Predator extends Factory implements Creator {
    @Override
    public Bird getBird(String s) {
        System.out.println(Program.ANSI_RED + "Створено хижу пташку" + Program.ANSI_RESET);
        switch (s)
        {
            case "Eagle":
                System.out.println(Program.ANSI_RED + "Створено орла" + Program.ANSI_RESET);
                notifyBirds();
                return new Eagle();
            case "Hawk":
                System.out.println(Program.ANSI_RED + "Створено яструба" + Program.ANSI_RESET);
                notifyBirds();
                return new Hawk();
            case "Owl":
                System.out.println(Program.ANSI_RED + "Створено сову" + Program.ANSI_RESET);
                notifyBirds();
                return new Owl();
            case "Griffin":
                System.out.println(Program.ANSI_RED + "Створено грифа" + Program.ANSI_RESET);
                notifyBirds();
                return new Griffin();
            default:
                return null;
        }
    }
    @Override
    public void notifyBirds() {
        System.out.println(Program.ANSI_RED + "Обережно! Літає хижа пташка!" + Program.ANSI_RESET);
        for (Bird b: Program.birds) {
            b.sit();
        }
    }
}

class NonPredator extends Factory {
    @Override
    public Bird getBird(String s) {
        System.out.println(Program.ANSI_GREEN + "Створено нехижу пташку" + Program.ANSI_RESET);
        switch (s)
        {
            case "Tit":
                System.out.println(Program.ANSI_GREEN + "Створено синицю" + Program.ANSI_RESET);
                return new Tit();
            case "Dove":
                System.out.println(Program.ANSI_GREEN + "Створено голуба" + Program.ANSI_RESET);
                return new Dove();
            case "Lark":
                System.out.println(Program.ANSI_GREEN + "Створено жайворона" + Program.ANSI_RESET);
                return new Lark();
            case "Nightingale":
                System.out.println(Program.ANSI_GREEN + "Створено соловейка" + Program.ANSI_RESET);
                return new Nightingale();
            default:
                return null;
        }
    }
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
}
