package factories;
import animals.Quackable;
import animals.DuckCall;
import animals.MallardDuck;
import animals.RedheadDuck;
import animals.RubberDuck;

public class DuckFactory extends AbstractDuckFactory {

    public Quackable createMallardDuck() {
        return new MallardDuck();    }

    public Quackable createRedheadDuck() {
        return new RedheadDuck();    }

    public Quackable createDuckCall() {
        return new DuckCall();    }

    public Quackable createRubberDuck() {
        return new RubberDuck();    }

}
